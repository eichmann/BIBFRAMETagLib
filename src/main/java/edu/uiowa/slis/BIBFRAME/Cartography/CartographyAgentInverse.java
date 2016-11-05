package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyAgentInverseIterator theCartographyAgentInverseIterator = (CartographyAgentInverseIterator)findAncestorWithClass(this, CartographyAgentInverseIterator.class);
			pageContext.getOut().print(theCartographyAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for agent tag ");
		}
		return SKIP_BODY;
	}
}

