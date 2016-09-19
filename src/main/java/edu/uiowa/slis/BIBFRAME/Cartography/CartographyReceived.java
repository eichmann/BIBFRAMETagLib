package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyReceivedIterator theCartographyReceivedIterator = (CartographyReceivedIterator)findAncestorWithClass(this, CartographyReceivedIterator.class);
			pageContext.getOut().print(theCartographyReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for received tag ");
		}
		return SKIP_BODY;
	}
}

