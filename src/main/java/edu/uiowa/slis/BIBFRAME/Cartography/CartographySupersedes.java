package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySupersedesIterator theCartographySupersedesIterator = (CartographySupersedesIterator)findAncestorWithClass(this, CartographySupersedesIterator.class);
			pageContext.getOut().print(theCartographySupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

