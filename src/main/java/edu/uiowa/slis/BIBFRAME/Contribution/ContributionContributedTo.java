package edu.uiowa.slis.BIBFRAME.Contribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContributionContributedTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContributionContributedTo currentInstance = null;
	private static final Log log = LogFactory.getLog(ContributionContributedTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContributionContributedToIterator theContributionContributedToIterator = (ContributionContributedToIterator)findAncestorWithClass(this, ContributionContributedToIterator.class);
			pageContext.getOut().print(theContributionContributedToIterator.getContributedTo());
		} catch (Exception e) {
			log.error("Can't find enclosing Contribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

