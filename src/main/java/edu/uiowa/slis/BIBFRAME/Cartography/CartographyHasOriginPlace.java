package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasOriginPlaceIterator theCartographyHasOriginPlaceIterator = (CartographyHasOriginPlaceIterator)findAncestorWithClass(this, CartographyHasOriginPlaceIterator.class);
			pageContext.getOut().print(theCartographyHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

