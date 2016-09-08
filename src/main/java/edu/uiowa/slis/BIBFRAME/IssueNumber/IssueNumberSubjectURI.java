package edu.uiowa.slis.BIBFRAME.IssueNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssueNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IssueNumber theIssueNumber = (IssueNumber)findAncestorWithClass(this, IssueNumber.class);
			if (!theIssueNumber.commitNeeded) {
				pageContext.getOut().print(theIssueNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IssueNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssueNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IssueNumber theIssueNumber = (IssueNumber)findAncestorWithClass(this, IssueNumber.class);
			return theIssueNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IssueNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssueNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IssueNumber theIssueNumber = (IssueNumber)findAncestorWithClass(this, IssueNumber.class);
			theIssueNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IssueNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssueNumber for subjectURI tag ");
		}
	}
}

