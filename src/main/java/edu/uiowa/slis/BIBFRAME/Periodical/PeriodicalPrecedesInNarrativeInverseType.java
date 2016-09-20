package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPrecedesInNarrativeInverseIterator thePeriodicalPrecedesInNarrativeInverseIterator = (PeriodicalPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, PeriodicalPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

