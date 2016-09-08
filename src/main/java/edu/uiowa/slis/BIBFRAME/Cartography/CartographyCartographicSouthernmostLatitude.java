package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicSouthernmostLatitude extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicSouthernmostLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicSouthernmostLatitude.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			if (!theCartography.commitNeeded) {
				pageContext.getOut().print(theCartography.getCartographicSouthernmostLatitude());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicSouthernmostLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicSouthernmostLatitude tag ");
		}
		return SKIP_BODY;
	}

	public String getCartographicSouthernmostLatitude() throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			return theCartography.getCartographicSouthernmostLatitude();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cartography for cartographicSouthernmostLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicSouthernmostLatitude tag ");
		}
	}

	public void setCartographicSouthernmostLatitude(String cartographicSouthernmostLatitude) throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			theCartography.setCartographicSouthernmostLatitude(cartographicSouthernmostLatitude);
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicSouthernmostLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicSouthernmostLatitude tag ");
		}
	}
}

