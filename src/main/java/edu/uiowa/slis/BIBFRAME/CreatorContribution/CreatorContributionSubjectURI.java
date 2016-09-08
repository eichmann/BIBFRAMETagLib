package edu.uiowa.slis.BIBFRAME.CreatorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CreatorContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CreatorContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CreatorContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CreatorContribution theCreatorContribution = (CreatorContribution)findAncestorWithClass(this, CreatorContribution.class);
			if (!theCreatorContribution.commitNeeded) {
				pageContext.getOut().print(theCreatorContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CreatorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CreatorContribution theCreatorContribution = (CreatorContribution)findAncestorWithClass(this, CreatorContribution.class);
			return theCreatorContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CreatorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CreatorContribution theCreatorContribution = (CreatorContribution)findAncestorWithClass(this, CreatorContribution.class);
			theCreatorContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CreatorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for subjectURI tag ");
		}
	}
}

