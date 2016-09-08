package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyTranslatedAsIterator theCartographyTranslatedAsIterator = (CartographyTranslatedAsIterator)findAncestorWithClass(this, CartographyTranslatedAsIterator.class);
			pageContext.getOut().print(theCartographyTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

