package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasContributionIterator thePeriodicalPartHasContributionIterator = (PeriodicalPartHasContributionIterator)findAncestorWithClass(this, PeriodicalPartHasContributionIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}
