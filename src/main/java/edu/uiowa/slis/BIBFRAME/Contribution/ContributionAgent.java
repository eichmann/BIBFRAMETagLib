package edu.uiowa.slis.BIBFRAME.Contribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContributionAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContributionAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(ContributionAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContributionAgentIterator theContributionAgentIterator = (ContributionAgentIterator)findAncestorWithClass(this, ContributionAgentIterator.class);
			pageContext.getOut().print(theContributionAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing Contribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

