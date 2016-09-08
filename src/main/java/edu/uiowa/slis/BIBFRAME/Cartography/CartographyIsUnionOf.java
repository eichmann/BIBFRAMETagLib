package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIsUnionOfIterator theCartographyIsUnionOfIterator = (CartographyIsUnionOfIterator)findAncestorWithClass(this, CartographyIsUnionOfIterator.class);
			pageContext.getOut().print(theCartographyIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

