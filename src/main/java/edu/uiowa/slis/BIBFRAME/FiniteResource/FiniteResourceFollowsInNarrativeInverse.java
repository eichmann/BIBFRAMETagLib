package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceFollowsInNarrativeInverseIterator theFiniteResourceFollowsInNarrativeInverseIterator = (FiniteResourceFollowsInNarrativeInverseIterator)findAncestorWithClass(this, FiniteResourceFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theFiniteResourceFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

