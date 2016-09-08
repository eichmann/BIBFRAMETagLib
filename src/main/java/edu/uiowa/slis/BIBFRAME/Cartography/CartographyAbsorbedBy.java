package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyAbsorbedByIterator theCartographyAbsorbedByIterator = (CartographyAbsorbedByIterator)findAncestorWithClass(this, CartographyAbsorbedByIterator.class);
			pageContext.getOut().print(theCartographyAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

