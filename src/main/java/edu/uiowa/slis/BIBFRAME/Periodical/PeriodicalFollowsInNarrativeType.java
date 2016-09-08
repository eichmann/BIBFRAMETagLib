package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFollowsInNarrativeIterator thePeriodicalFollowsInNarrativeIterator = (PeriodicalFollowsInNarrativeIterator)findAncestorWithClass(this, PeriodicalFollowsInNarrativeIterator.class);
			pageContext.getOut().print(thePeriodicalFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

