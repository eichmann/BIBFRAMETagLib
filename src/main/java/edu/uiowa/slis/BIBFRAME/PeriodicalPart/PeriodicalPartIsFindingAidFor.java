package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIsFindingAidForIterator thePeriodicalPartIsFindingAidForIterator = (PeriodicalPartIsFindingAidForIterator)findAncestorWithClass(this, PeriodicalPartIsFindingAidForIterator.class);
			pageContext.getOut().print(thePeriodicalPartIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

