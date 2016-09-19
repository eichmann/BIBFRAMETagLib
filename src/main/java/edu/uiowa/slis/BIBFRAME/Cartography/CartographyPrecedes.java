package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyPrecedesIterator theCartographyPrecedesIterator = (CartographyPrecedesIterator)findAncestorWithClass(this, CartographyPrecedesIterator.class);
			pageContext.getOut().print(theCartographyPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for precedes tag ");
		}
		return SKIP_BODY;
	}
}

