package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MovingImageLanguageNoteIterator theMovingImage = (MovingImageLanguageNoteIterator)findAncestorWithClass(this, MovingImageLanguageNoteIterator.class);
			pageContext.getOut().print(theMovingImage.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

