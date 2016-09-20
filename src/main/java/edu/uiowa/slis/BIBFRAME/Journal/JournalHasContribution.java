package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasContributionIterator theJournalHasContributionIterator = (JournalHasContributionIterator)findAncestorWithClass(this, JournalHasContributionIterator.class);
			pageContext.getOut().print(theJournalHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

