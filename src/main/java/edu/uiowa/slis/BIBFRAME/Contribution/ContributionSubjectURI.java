package edu.uiowa.slis.BIBFRAME.Contribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contribution theContribution = (Contribution)findAncestorWithClass(this, Contribution.class);
			if (!theContribution.commitNeeded) {
				pageContext.getOut().print(theContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Contribution theContribution = (Contribution)findAncestorWithClass(this, Contribution.class);
			return theContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Contribution theContribution = (Contribution)findAncestorWithClass(this, Contribution.class);
			theContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Contribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for subjectURI tag ");
		}
	}
}

