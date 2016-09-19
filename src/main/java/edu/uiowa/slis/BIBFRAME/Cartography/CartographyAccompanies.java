package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyAccompaniesIterator theCartographyAccompaniesIterator = (CartographyAccompaniesIterator)findAncestorWithClass(this, CartographyAccompaniesIterator.class);
			pageContext.getOut().print(theCartographyAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

