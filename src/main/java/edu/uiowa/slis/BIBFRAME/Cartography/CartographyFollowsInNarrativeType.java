package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyFollowsInNarrativeIterator theCartographyFollowsInNarrativeIterator = (CartographyFollowsInNarrativeIterator)findAncestorWithClass(this, CartographyFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theCartographyFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

