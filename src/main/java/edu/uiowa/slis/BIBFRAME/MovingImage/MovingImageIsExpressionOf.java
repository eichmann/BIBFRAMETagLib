package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIsExpressionOfIterator theMovingImageIsExpressionOfIterator = (MovingImageIsExpressionOfIterator)findAncestorWithClass(this, MovingImageIsExpressionOfIterator.class);
			pageContext.getOut().print(theMovingImageIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

