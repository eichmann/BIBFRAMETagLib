package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyLanguageIterator theCartographyLanguageIterator = (CartographyLanguageIterator)findAncestorWithClass(this, CartographyLanguageIterator.class);
			pageContext.getOut().print(theCartographyLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for language tag ");
		}
		return SKIP_BODY;
	}
}
