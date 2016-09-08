package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasExpressionIterator theMovingImageHasExpressionIterator = (MovingImageHasExpressionIterator)findAncestorWithClass(this, MovingImageHasExpressionIterator.class);
			pageContext.getOut().print(theMovingImageHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

