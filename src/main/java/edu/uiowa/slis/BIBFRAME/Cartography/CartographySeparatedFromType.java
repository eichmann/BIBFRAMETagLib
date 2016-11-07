package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySeparatedFromIterator theCartographySeparatedFromIterator = (CartographySeparatedFromIterator)findAncestorWithClass(this, CartographySeparatedFromIterator.class);
			pageContext.getOut().print(theCartographySeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}
