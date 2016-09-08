package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySupersededByIterator theCartographySupersededByIterator = (CartographySupersededByIterator)findAncestorWithClass(this, CartographySupersededByIterator.class);
			pageContext.getOut().print(theCartographySupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

