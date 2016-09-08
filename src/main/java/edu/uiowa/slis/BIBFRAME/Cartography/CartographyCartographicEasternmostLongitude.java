package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicEasternmostLongitude extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicEasternmostLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicEasternmostLongitude.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			if (!theCartography.commitNeeded) {
				pageContext.getOut().print(theCartography.getCartographicEasternmostLongitude());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicEasternmostLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicEasternmostLongitude tag ");
		}
		return SKIP_BODY;
	}

	public String getCartographicEasternmostLongitude() throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			return theCartography.getCartographicEasternmostLongitude();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cartography for cartographicEasternmostLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicEasternmostLongitude tag ");
		}
	}

	public void setCartographicEasternmostLongitude(String cartographicEasternmostLongitude) throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			theCartography.setCartographicEasternmostLongitude(cartographicEasternmostLongitude);
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicEasternmostLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicEasternmostLongitude tag ");
		}
	}
}

