package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIsExpressionOfIterator theCartographyIsExpressionOfIterator = (CartographyIsExpressionOfIterator)findAncestorWithClass(this, CartographyIsExpressionOfIterator.class);
			pageContext.getOut().print(theCartographyIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

