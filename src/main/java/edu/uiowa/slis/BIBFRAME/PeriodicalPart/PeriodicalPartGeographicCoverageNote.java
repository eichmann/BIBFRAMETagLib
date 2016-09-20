package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartGeographicCoverageNoteIterator thePeriodicalPart = (PeriodicalPartGeographicCoverageNoteIterator)findAncestorWithClass(this, PeriodicalPartGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(thePeriodicalPart.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

