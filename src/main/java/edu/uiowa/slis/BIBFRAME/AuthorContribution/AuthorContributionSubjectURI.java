package edu.uiowa.slis.BIBFRAME.AuthorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AuthorContribution theAuthorContribution = (AuthorContribution)findAncestorWithClass(this, AuthorContribution.class);
			if (!theAuthorContribution.commitNeeded) {
				pageContext.getOut().print(theAuthorContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AuthorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AuthorContribution theAuthorContribution = (AuthorContribution)findAncestorWithClass(this, AuthorContribution.class);
			return theAuthorContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AuthorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AuthorContribution theAuthorContribution = (AuthorContribution)findAncestorWithClass(this, AuthorContribution.class);
			theAuthorContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AuthorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AuthorContribution for subjectURI tag ");
		}
	}
}

