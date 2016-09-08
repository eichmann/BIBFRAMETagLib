package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartContinuedUnderNewTitleByIterator thePeriodicalPartContinuedUnderNewTitleByIterator = (PeriodicalPartContinuedUnderNewTitleByIterator)findAncestorWithClass(this, PeriodicalPartContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(thePeriodicalPartContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

