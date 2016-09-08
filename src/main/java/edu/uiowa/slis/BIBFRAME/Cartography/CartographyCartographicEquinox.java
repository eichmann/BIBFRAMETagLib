package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCartographicEquinox extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicEquinox currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicEquinox.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyCartographicEquinoxIterator theCartography = (CartographyCartographicEquinoxIterator)findAncestorWithClass(this, CartographyCartographicEquinoxIterator.class);
			pageContext.getOut().print(theCartography.getCartographicEquinox());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for cartographicEquinox tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for cartographicEquinox tag ");
		}
		return SKIP_BODY;
	}
}

