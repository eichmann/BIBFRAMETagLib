package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFollowsInNarrativeInverseIterator thePeriodicalFollowsInNarrativeInverseIterator = (PeriodicalFollowsInNarrativeInverseIterator)findAncestorWithClass(this, PeriodicalFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(thePeriodicalFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

