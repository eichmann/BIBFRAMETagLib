package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartFollowsInNarrativeIterator thePeriodicalPartFollowsInNarrativeIterator = (PeriodicalPartFollowsInNarrativeIterator)findAncestorWithClass(this, PeriodicalPartFollowsInNarrativeIterator.class);
			pageContext.getOut().print(thePeriodicalPartFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

