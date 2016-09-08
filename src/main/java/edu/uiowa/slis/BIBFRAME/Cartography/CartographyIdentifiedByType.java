package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIdentifiedByIterator theCartographyIdentifiedByIterator = (CartographyIdentifiedByIterator)findAncestorWithClass(this, CartographyIdentifiedByIterator.class);
			pageContext.getOut().print(theCartographyIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

