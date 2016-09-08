package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicWesternmostLongitude extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicWesternmostLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicWesternmostLongitude.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			if (!theCartography.commitNeeded) {
				pageContext.getOut().print(theCartography.getCartographicWesternmostLongitude());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicWesternmostLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicWesternmostLongitude tag ");
		}
		return SKIP_BODY;
	}

	public String getCartographicWesternmostLongitude() throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			return theCartography.getCartographicWesternmostLongitude();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cartography for cartographicWesternmostLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicWesternmostLongitude tag ");
		}
	}

	public void setCartographicWesternmostLongitude(String cartographicWesternmostLongitude) throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			theCartography.setCartographicWesternmostLongitude(cartographicWesternmostLongitude);
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicWesternmostLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicWesternmostLongitude tag ");
		}
	}
}

