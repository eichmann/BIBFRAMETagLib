package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultimediaLanguageNoteIterator theMultimedia = (MultimediaLanguageNoteIterator)findAncestorWithClass(this, MultimediaLanguageNoteIterator.class);
			pageContext.getOut().print(theMultimedia.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

