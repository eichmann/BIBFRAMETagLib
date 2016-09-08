package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartTemporalCoverageNoteIterator thePeriodicalPart = (PeriodicalPartTemporalCoverageNoteIterator)findAncestorWithClass(this, PeriodicalPartTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(thePeriodicalPart.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

