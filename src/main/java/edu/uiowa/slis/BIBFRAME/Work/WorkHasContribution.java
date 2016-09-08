package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasContributionIterator theWorkHasContributionIterator = (WorkHasContributionIterator)findAncestorWithClass(this, WorkHasContributionIterator.class);
			pageContext.getOut().print(theWorkHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

