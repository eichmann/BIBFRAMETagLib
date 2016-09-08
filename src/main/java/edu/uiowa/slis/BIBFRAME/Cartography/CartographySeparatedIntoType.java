package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySeparatedIntoIterator theCartographySeparatedIntoIterator = (CartographySeparatedIntoIterator)findAncestorWithClass(this, CartographySeparatedIntoIterator.class);
			pageContext.getOut().print(theCartographySeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

