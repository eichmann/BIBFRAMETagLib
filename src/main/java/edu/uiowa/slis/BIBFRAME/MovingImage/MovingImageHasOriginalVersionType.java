package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasOriginalVersionIterator theMovingImageHasOriginalVersionIterator = (MovingImageHasOriginalVersionIterator)findAncestorWithClass(this, MovingImageHasOriginalVersionIterator.class);
			pageContext.getOut().print(theMovingImageHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

