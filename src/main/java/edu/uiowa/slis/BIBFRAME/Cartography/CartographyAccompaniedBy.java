package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyAccompaniedByIterator theCartographyAccompaniedByIterator = (CartographyAccompaniedByIterator)findAncestorWithClass(this, CartographyAccompaniedByIterator.class);
			pageContext.getOut().print(theCartographyAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

