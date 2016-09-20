package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographLanguageNoteIterator theMultipartMonograph = (MultipartMonographLanguageNoteIterator)findAncestorWithClass(this, MultipartMonographLanguageNoteIterator.class);
			pageContext.getOut().print(theMultipartMonograph.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

