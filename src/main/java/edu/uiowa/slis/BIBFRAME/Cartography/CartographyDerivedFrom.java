package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyDerivedFromIterator theCartographyDerivedFromIterator = (CartographyDerivedFromIterator)findAncestorWithClass(this, CartographyDerivedFromIterator.class);
			pageContext.getOut().print(theCartographyDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

