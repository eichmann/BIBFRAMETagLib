package edu.uiowa.slis.BIBFRAME.IssueNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssueNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IssueNumber theIssueNumber = (IssueNumber)findAncestorWithClass(this, IssueNumber.class);
			if (!theIssueNumber.commitNeeded) {
				pageContext.getOut().print(theIssueNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IssueNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssueNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			IssueNumber theIssueNumber = (IssueNumber)findAncestorWithClass(this, IssueNumber.class);
			return theIssueNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing IssueNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssueNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			IssueNumber theIssueNumber = (IssueNumber)findAncestorWithClass(this, IssueNumber.class);
			theIssueNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing IssueNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssueNumber for label tag ");
		}
	}
}

