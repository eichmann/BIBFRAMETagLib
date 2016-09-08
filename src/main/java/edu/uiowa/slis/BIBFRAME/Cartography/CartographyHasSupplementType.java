package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasSupplementIterator theCartographyHasSupplementIterator = (CartographyHasSupplementIterator)findAncestorWithClass(this, CartographyHasSupplementIterator.class);
			pageContext.getOut().print(theCartographyHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

