package edu.uiowa.slis.BIBFRAME.AuthorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorContributionAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorContributionAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorContributionAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorContributionAgentIterator theAuthorContributionAgentIterator = (AuthorContributionAgentIterator)findAncestorWithClass(this, AuthorContributionAgentIterator.class);
			pageContext.getOut().print(theAuthorContributionAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing AuthorContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

