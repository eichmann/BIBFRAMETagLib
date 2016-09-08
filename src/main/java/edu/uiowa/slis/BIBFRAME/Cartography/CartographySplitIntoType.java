package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySplitIntoIterator theCartographySplitIntoIterator = (CartographySplitIntoIterator)findAncestorWithClass(this, CartographySplitIntoIterator.class);
			pageContext.getOut().print(theCartographySplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

