package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyPrecedesInNarrativeInverseIterator theCartographyPrecedesInNarrativeInverseIterator = (CartographyPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, CartographyPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theCartographyPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

