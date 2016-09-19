package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasOriginalVersionInverseIterator theMovingImageHasOriginalVersionInverseIterator = (MovingImageHasOriginalVersionInverseIterator)findAncestorWithClass(this, MovingImageHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theMovingImageHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

