package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyFollowsInNarrativeInverseIterator theCartographyFollowsInNarrativeInverseIterator = (CartographyFollowsInNarrativeInverseIterator)findAncestorWithClass(this, CartographyFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theCartographyFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

