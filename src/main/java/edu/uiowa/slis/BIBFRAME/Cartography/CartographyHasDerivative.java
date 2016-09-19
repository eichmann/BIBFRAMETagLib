package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasDerivativeIterator theCartographyHasDerivativeIterator = (CartographyHasDerivativeIterator)findAncestorWithClass(this, CartographyHasDerivativeIterator.class);
			pageContext.getOut().print(theCartographyHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

