package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasDerivativeIterator theCartographyHasDerivativeIterator = (CartographyHasDerivativeIterator)findAncestorWithClass(this, CartographyHasDerivativeIterator.class);
			pageContext.getOut().print(theCartographyHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

