package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalTemporalCoverageNoteIterator thePeriodical = (PeriodicalTemporalCoverageNoteIterator)findAncestorWithClass(this, PeriodicalTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(thePeriodical.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

