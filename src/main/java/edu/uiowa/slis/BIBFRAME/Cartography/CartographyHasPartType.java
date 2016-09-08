package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasPartIterator theCartographyHasPartIterator = (CartographyHasPartIterator)findAncestorWithClass(this, CartographyHasPartIterator.class);
			pageContext.getOut().print(theCartographyHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

