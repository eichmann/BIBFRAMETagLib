package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPerformedAtIterator thePeriodicalPerformedAtIterator = (PeriodicalPerformedAtIterator)findAncestorWithClass(this, PeriodicalPerformedAtIterator.class);
			pageContext.getOut().print(thePeriodicalPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

