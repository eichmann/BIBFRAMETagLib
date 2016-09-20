package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasContributionIterator thePeriodicalHasContributionIterator = (PeriodicalHasContributionIterator)findAncestorWithClass(this, PeriodicalHasContributionIterator.class);
			pageContext.getOut().print(thePeriodicalHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

