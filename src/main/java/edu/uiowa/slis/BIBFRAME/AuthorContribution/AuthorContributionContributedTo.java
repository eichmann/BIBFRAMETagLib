package edu.uiowa.slis.BIBFRAME.AuthorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorContributionContributedTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorContributionContributedTo currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorContributionContributedTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorContributionContributedToIterator theAuthorContributionContributedToIterator = (AuthorContributionContributedToIterator)findAncestorWithClass(this, AuthorContributionContributedToIterator.class);
			pageContext.getOut().print(theAuthorContributionContributedToIterator.getContributedTo());
		} catch (Exception e) {
			log.error("Can't find enclosing AuthorContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

