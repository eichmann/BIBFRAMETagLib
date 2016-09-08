package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasExpressionIterator theThreeDimensionalObjectHasExpressionIterator = (ThreeDimensionalObjectHasExpressionIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasExpressionIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

