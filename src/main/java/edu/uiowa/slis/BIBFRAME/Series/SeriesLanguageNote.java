package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesLanguageNoteIterator theSeries = (SeriesLanguageNoteIterator)findAncestorWithClass(this, SeriesLanguageNoteIterator.class);
			pageContext.getOut().print(theSeries.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

