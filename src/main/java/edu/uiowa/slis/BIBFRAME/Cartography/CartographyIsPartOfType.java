package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIsPartOfIterator theCartographyIsPartOfIterator = (CartographyIsPartOfIterator)findAncestorWithClass(this, CartographyIsPartOfIterator.class);
			pageContext.getOut().print(theCartographyIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

