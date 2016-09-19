package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasPreferredTitleIterator theCartographyHasPreferredTitleIterator = (CartographyHasPreferredTitleIterator)findAncestorWithClass(this, CartographyHasPreferredTitleIterator.class);
			pageContext.getOut().print(theCartographyHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

