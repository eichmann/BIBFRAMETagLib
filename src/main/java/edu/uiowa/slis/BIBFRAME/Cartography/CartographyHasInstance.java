package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasInstanceIterator theCartographyHasInstanceIterator = (CartographyHasInstanceIterator)findAncestorWithClass(this, CartographyHasInstanceIterator.class);
			pageContext.getOut().print(theCartographyHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

