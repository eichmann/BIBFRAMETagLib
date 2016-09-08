package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyFollowsInNarrativeIterator theCartographyFollowsInNarrativeIterator = (CartographyFollowsInNarrativeIterator)findAncestorWithClass(this, CartographyFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theCartographyFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

