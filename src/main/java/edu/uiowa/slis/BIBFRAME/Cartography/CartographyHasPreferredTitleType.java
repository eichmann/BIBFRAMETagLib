package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasPreferredTitleIterator theCartographyHasPreferredTitleIterator = (CartographyHasPreferredTitleIterator)findAncestorWithClass(this, CartographyHasPreferredTitleIterator.class);
			pageContext.getOut().print(theCartographyHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

