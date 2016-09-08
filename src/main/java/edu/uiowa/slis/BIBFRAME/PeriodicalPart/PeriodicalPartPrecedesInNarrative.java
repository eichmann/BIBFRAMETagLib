package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartPrecedesInNarrativeIterator thePeriodicalPartPrecedesInNarrativeIterator = (PeriodicalPartPrecedesInNarrativeIterator)findAncestorWithClass(this, PeriodicalPartPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(thePeriodicalPartPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

