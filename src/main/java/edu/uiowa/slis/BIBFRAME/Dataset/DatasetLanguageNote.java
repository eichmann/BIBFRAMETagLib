package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetLanguageNoteIterator theDataset = (DatasetLanguageNoteIterator)findAncestorWithClass(this, DatasetLanguageNoteIterator.class);
			pageContext.getOut().print(theDataset.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

