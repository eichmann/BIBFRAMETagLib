package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasAbsorbedIterator theCartographyHasAbsorbedIterator = (CartographyHasAbsorbedIterator)findAncestorWithClass(this, CartographyHasAbsorbedIterator.class);
			pageContext.getOut().print(theCartographyHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

