package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartFollowsInNarrativeInverseIterator thePeriodicalPartFollowsInNarrativeInverseIterator = (PeriodicalPartFollowsInNarrativeInverseIterator)findAncestorWithClass(this, PeriodicalPartFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

