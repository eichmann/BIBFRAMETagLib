package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyTranslatesIterator theCartographyTranslatesIterator = (CartographyTranslatesIterator)findAncestorWithClass(this, CartographyTranslatesIterator.class);
			pageContext.getOut().print(theCartographyTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for translates tag ");
		}
		return SKIP_BODY;
	}
}

