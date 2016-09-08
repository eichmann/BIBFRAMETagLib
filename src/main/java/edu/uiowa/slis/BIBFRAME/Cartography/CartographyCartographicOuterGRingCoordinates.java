package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicOuterGRingCoordinates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicOuterGRingCoordinates currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicOuterGRingCoordinates.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyCartographicOuterGRingCoordinatesIterator theCartography = (CartographyCartographicOuterGRingCoordinatesIterator)findAncestorWithClass(this, CartographyCartographicOuterGRingCoordinatesIterator.class);
			pageContext.getOut().print(theCartography.getCartographicOuterGRingCoordinates());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicOuterGRingCoordinates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicOuterGRingCoordinates tag ");
		}
		return SKIP_BODY;
	}
}

