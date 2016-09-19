package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasOtherEditionInverseIterator theCartographyHasOtherEditionInverseIterator = (CartographyHasOtherEditionInverseIterator)findAncestorWithClass(this, CartographyHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theCartographyHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

