package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalGeographicCoverageNoteIterator thePeriodical = (PeriodicalGeographicCoverageNoteIterator)findAncestorWithClass(this, PeriodicalGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(thePeriodical.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

