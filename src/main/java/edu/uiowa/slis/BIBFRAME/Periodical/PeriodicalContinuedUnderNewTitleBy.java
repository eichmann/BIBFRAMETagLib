package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalContinuedUnderNewTitleByIterator thePeriodicalContinuedUnderNewTitleByIterator = (PeriodicalContinuedUnderNewTitleByIterator)findAncestorWithClass(this, PeriodicalContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(thePeriodicalContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

