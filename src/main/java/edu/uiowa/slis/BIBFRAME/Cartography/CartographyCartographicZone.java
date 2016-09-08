package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicZone extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicZone currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicZone.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			if (!theCartography.commitNeeded) {
				pageContext.getOut().print(theCartography.getCartographicZone());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicZone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicZone tag ");
		}
		return SKIP_BODY;
	}

	public String getCartographicZone() throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			return theCartography.getCartographicZone();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cartography for cartographicZone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicZone tag ");
		}
	}

	public void setCartographicZone(String cartographicZone) throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			theCartography.setCartographicZone(cartographicZone);
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicZone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicZone tag ");
		}
	}
}

