package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyAgentInverseIterator theCartographyAgentInverseIterator = (CartographyAgentInverseIterator)findAncestorWithClass(this, CartographyAgentInverseIterator.class);
			pageContext.getOut().print(theCartographyAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for agent tag ");
		}
		return SKIP_BODY;
	}
}

