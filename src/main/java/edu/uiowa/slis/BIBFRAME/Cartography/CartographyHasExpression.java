package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasExpressionIterator theCartographyHasExpressionIterator = (CartographyHasExpressionIterator)findAncestorWithClass(this, CartographyHasExpressionIterator.class);
			pageContext.getOut().print(theCartographyHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

