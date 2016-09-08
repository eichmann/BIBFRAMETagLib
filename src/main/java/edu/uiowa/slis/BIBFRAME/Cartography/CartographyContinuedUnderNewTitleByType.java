package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyContinuedUnderNewTitleByIterator theCartographyContinuedUnderNewTitleByIterator = (CartographyContinuedUnderNewTitleByIterator)findAncestorWithClass(this, CartographyContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theCartographyContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

