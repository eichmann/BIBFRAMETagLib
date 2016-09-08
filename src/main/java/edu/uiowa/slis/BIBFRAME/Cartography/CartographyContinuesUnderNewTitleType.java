package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyContinuesUnderNewTitleIterator theCartographyContinuesUnderNewTitleIterator = (CartographyContinuesUnderNewTitleIterator)findAncestorWithClass(this, CartographyContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theCartographyContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

