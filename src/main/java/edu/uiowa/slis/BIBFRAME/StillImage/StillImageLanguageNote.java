package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StillImageLanguageNoteIterator theStillImage = (StillImageLanguageNoteIterator)findAncestorWithClass(this, StillImageLanguageNoteIterator.class);
			pageContext.getOut().print(theStillImage.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

