package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySupplementsIterator theCartographySupplementsIterator = (CartographySupplementsIterator)findAncestorWithClass(this, CartographySupplementsIterator.class);
			pageContext.getOut().print(theCartographySupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for supplements tag ");
		}
		return SKIP_BODY;
	}
}

