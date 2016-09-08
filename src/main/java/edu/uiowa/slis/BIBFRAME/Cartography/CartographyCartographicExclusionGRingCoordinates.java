package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicExclusionGRingCoordinates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicExclusionGRingCoordinates currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicExclusionGRingCoordinates.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyCartographicExclusionGRingCoordinatesIterator theCartography = (CartographyCartographicExclusionGRingCoordinatesIterator)findAncestorWithClass(this, CartographyCartographicExclusionGRingCoordinatesIterator.class);
			pageContext.getOut().print(theCartography.getCartographicExclusionGRingCoordinates());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicExclusionGRingCoordinates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicExclusionGRingCoordinates tag ");
		}
		return SKIP_BODY;
	}
}

