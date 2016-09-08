package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasExpressionIterator theStillImageHasExpressionIterator = (StillImageHasExpressionIterator)findAncestorWithClass(this, StillImageHasExpressionIterator.class);
			pageContext.getOut().print(theStillImageHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

