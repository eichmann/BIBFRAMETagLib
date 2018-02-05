package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyName currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyNameIterator theCartography = (CartographyNameIterator)findAncestorWithClass(this, CartographyNameIterator.class);
			pageContext.getOut().print(theCartography.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for name tag ");
		}
		return SKIP_BODY;
	}
}

