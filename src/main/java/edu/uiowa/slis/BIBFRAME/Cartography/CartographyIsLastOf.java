package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIsLastOfIterator theCartographyIsLastOfIterator = (CartographyIsLastOfIterator)findAncestorWithClass(this, CartographyIsLastOfIterator.class);
			pageContext.getOut().print(theCartographyIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

