package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySeparatedFromIterator theCartographySeparatedFromIterator = (CartographySeparatedFromIterator)findAncestorWithClass(this, CartographySeparatedFromIterator.class);
			pageContext.getOut().print(theCartographySeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

