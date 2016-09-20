package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFollowsInNarrativeInverseIterator thePeriodicalFollowsInNarrativeInverseIterator = (PeriodicalFollowsInNarrativeInverseIterator)findAncestorWithClass(this, PeriodicalFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(thePeriodicalFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

