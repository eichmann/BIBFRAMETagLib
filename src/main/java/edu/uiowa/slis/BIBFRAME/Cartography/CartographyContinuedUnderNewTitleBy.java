package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyContinuedUnderNewTitleByIterator theCartographyContinuedUnderNewTitleByIterator = (CartographyContinuedUnderNewTitleByIterator)findAncestorWithClass(this, CartographyContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theCartographyContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

