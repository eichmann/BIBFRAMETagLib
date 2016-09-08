package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyTranslatesIterator theCartographyTranslatesIterator = (CartographyTranslatesIterator)findAncestorWithClass(this, CartographyTranslatesIterator.class);
			pageContext.getOut().print(theCartographyTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for translates tag ");
		}
		return SKIP_BODY;
	}
}

