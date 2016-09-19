package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasTitleIterator theCartographyHasTitleIterator = (CartographyHasTitleIterator)findAncestorWithClass(this, CartographyHasTitleIterator.class);
			pageContext.getOut().print(theCartographyHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

