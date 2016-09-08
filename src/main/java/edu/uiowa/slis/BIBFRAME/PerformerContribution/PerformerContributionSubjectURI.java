package edu.uiowa.slis.BIBFRAME.PerformerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformerContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PerformerContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformerContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PerformerContribution thePerformerContribution = (PerformerContribution)findAncestorWithClass(this, PerformerContribution.class);
			if (!thePerformerContribution.commitNeeded) {
				pageContext.getOut().print(thePerformerContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PerformerContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PerformerContribution thePerformerContribution = (PerformerContribution)findAncestorWithClass(this, PerformerContribution.class);
			return thePerformerContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PerformerContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PerformerContribution thePerformerContribution = (PerformerContribution)findAncestorWithClass(this, PerformerContribution.class);
			thePerformerContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PerformerContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for subjectURI tag ");
		}
	}
}

