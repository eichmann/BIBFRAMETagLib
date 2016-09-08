package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicProjection extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicProjection currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicProjection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyCartographicProjectionIterator theCartography = (CartographyCartographicProjectionIterator)findAncestorWithClass(this, CartographyCartographicProjectionIterator.class);
			pageContext.getOut().print(theCartography.getCartographicProjection());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicProjection tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicProjection tag ");
		}
		return SKIP_BODY;
	}
}

