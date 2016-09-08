package edu.uiowa.slis.BIBFRAME.NarratorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NarratorContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NarratorContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NarratorContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NarratorContribution theNarratorContribution = (NarratorContribution)findAncestorWithClass(this, NarratorContribution.class);
			if (!theNarratorContribution.commitNeeded) {
				pageContext.getOut().print(theNarratorContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NarratorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NarratorContribution theNarratorContribution = (NarratorContribution)findAncestorWithClass(this, NarratorContribution.class);
			return theNarratorContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NarratorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NarratorContribution theNarratorContribution = (NarratorContribution)findAncestorWithClass(this, NarratorContribution.class);
			theNarratorContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NarratorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for subjectURI tag ");
		}
	}
}

