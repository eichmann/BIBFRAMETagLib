package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartPrecedesInNarrativeInverseIterator thePeriodicalPartPrecedesInNarrativeInverseIterator = (PeriodicalPartPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, PeriodicalPartPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

