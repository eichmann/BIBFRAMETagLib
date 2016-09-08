package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartContinuedUnderNewTitleByIterator thePeriodicalPartContinuedUnderNewTitleByIterator = (PeriodicalPartContinuedUnderNewTitleByIterator)findAncestorWithClass(this, PeriodicalPartContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(thePeriodicalPartContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

