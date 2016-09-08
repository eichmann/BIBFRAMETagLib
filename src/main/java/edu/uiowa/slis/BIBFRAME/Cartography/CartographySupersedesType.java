package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySupersedesIterator theCartographySupersedesIterator = (CartographySupersedesIterator)findAncestorWithClass(this, CartographySupersedesIterator.class);
			pageContext.getOut().print(theCartographySupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

