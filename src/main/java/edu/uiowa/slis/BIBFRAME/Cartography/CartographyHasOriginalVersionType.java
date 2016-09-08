package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasOriginalVersionIterator theCartographyHasOriginalVersionIterator = (CartographyHasOriginalVersionIterator)findAncestorWithClass(this, CartographyHasOriginalVersionIterator.class);
			pageContext.getOut().print(theCartographyHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

