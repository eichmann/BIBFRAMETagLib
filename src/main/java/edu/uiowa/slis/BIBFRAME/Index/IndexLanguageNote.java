package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndexLanguageNoteIterator theIndex = (IndexLanguageNoteIterator)findAncestorWithClass(this, IndexLanguageNoteIterator.class);
			pageContext.getOut().print(theIndex.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

