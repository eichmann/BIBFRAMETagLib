package edu.uiowa.slis.BIBFRAME.AuthorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AuthorContribution theAuthorContribution = (AuthorContribution)findAncestorWithClass(this, AuthorContribution.class);
			if (!theAuthorContribution.commitNeeded) {
				pageContext.getOut().print(theAuthorContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AuthorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AuthorContribution theAuthorContribution = (AuthorContribution)findAncestorWithClass(this, AuthorContribution.class);
			return theAuthorContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AuthorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AuthorContribution theAuthorContribution = (AuthorContribution)findAncestorWithClass(this, AuthorContribution.class);
			theAuthorContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AuthorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for label tag ");
		}
	}
}

