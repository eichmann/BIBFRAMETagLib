package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicScale extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicScale currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicScale.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyCartographicScaleIterator theCartography = (CartographyCartographicScaleIterator)findAncestorWithClass(this, CartographyCartographicScaleIterator.class);
			pageContext.getOut().print(theCartography.getCartographicScale());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicScale tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicScale tag ");
		}
		return SKIP_BODY;
	}
}

