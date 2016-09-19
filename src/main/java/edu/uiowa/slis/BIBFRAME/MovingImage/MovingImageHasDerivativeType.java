package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasDerivativeIterator theMovingImageHasDerivativeIterator = (MovingImageHasDerivativeIterator)findAncestorWithClass(this, MovingImageHasDerivativeIterator.class);
			pageContext.getOut().print(theMovingImageHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

