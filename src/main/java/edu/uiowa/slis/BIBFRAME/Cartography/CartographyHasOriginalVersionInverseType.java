package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasOriginalVersionInverseIterator theCartographyHasOriginalVersionInverseIterator = (CartographyHasOriginalVersionInverseIterator)findAncestorWithClass(this, CartographyHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theCartographyHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

