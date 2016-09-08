package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartPerformedAtIterator thePeriodicalPartPerformedAtIterator = (PeriodicalPartPerformedAtIterator)findAncestorWithClass(this, PeriodicalPartPerformedAtIterator.class);
			pageContext.getOut().print(thePeriodicalPartPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

