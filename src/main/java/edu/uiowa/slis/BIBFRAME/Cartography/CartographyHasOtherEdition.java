package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasOtherEditionIterator theCartographyHasOtherEditionIterator = (CartographyHasOtherEditionIterator)findAncestorWithClass(this, CartographyHasOtherEditionIterator.class);
			pageContext.getOut().print(theCartographyHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

