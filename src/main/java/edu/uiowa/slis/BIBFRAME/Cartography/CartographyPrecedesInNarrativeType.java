package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyPrecedesInNarrativeIterator theCartographyPrecedesInNarrativeIterator = (CartographyPrecedesInNarrativeIterator)findAncestorWithClass(this, CartographyPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theCartographyPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}
