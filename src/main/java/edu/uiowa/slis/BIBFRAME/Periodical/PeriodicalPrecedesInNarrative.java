package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPrecedesInNarrativeIterator thePeriodicalPrecedesInNarrativeIterator = (PeriodicalPrecedesInNarrativeIterator)findAncestorWithClass(this, PeriodicalPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(thePeriodicalPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

