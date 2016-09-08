package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySupersededByIterator theCartographySupersededByIterator = (CartographySupersededByIterator)findAncestorWithClass(this, CartographySupersededByIterator.class);
			pageContext.getOut().print(theCartographySupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

