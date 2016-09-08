package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyProducedAtIterator theCartographyProducedAtIterator = (CartographyProducedAtIterator)findAncestorWithClass(this, CartographyProducedAtIterator.class);
			pageContext.getOut().print(theCartographyProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

