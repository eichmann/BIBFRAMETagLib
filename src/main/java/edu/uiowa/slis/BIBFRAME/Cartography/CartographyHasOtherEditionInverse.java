package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasOtherEditionInverseIterator theCartographyHasOtherEditionInverseIterator = (CartographyHasOtherEditionInverseIterator)findAncestorWithClass(this, CartographyHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theCartographyHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

