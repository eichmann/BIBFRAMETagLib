package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicNorthernmostLatitude extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicNorthernmostLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicNorthernmostLatitude.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			if (!theCartography.commitNeeded) {
				pageContext.getOut().print(theCartography.getCartographicNorthernmostLatitude());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicNorthernmostLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicNorthernmostLatitude tag ");
		}
		return SKIP_BODY;
	}

	public String getCartographicNorthernmostLatitude() throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			return theCartography.getCartographicNorthernmostLatitude();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cartography for cartographicNorthernmostLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicNorthernmostLatitude tag ");
		}
	}

	public void setCartographicNorthernmostLatitude(String cartographicNorthernmostLatitude) throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			theCartography.setCartographicNorthernmostLatitude(cartographicNorthernmostLatitude);
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicNorthernmostLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicNorthernmostLatitude tag ");
		}
	}
}

