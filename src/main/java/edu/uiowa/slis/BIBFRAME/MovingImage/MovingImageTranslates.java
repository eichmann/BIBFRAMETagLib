package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageTranslatesIterator theMovingImageTranslatesIterator = (MovingImageTranslatesIterator)findAncestorWithClass(this, MovingImageTranslatesIterator.class);
			pageContext.getOut().print(theMovingImageTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for translates tag ");
		}
		return SKIP_BODY;
	}
}

