package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasExpressionIterator theCartographyHasExpressionIterator = (CartographyHasExpressionIterator)findAncestorWithClass(this, CartographyHasExpressionIterator.class);
			pageContext.getOut().print(theCartographyHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

