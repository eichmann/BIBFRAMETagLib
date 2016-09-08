package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceFollowsInNarrativeIterator theFiniteResourceFollowsInNarrativeIterator = (FiniteResourceFollowsInNarrativeIterator)findAncestorWithClass(this, FiniteResourceFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theFiniteResourceFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

