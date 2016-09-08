package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIsFirstOfIterator theCartographyIsFirstOfIterator = (CartographyIsFirstOfIterator)findAncestorWithClass(this, CartographyIsFirstOfIterator.class);
			pageContext.getOut().print(theCartographyIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

