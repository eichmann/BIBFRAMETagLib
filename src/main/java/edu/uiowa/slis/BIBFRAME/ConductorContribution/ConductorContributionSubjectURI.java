package edu.uiowa.slis.BIBFRAME.ConductorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConductorContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConductorContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConductorContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConductorContribution theConductorContribution = (ConductorContribution)findAncestorWithClass(this, ConductorContribution.class);
			if (!theConductorContribution.commitNeeded) {
				pageContext.getOut().print(theConductorContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConductorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ConductorContribution theConductorContribution = (ConductorContribution)findAncestorWithClass(this, ConductorContribution.class);
			return theConductorContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConductorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ConductorContribution theConductorContribution = (ConductorContribution)findAncestorWithClass(this, ConductorContribution.class);
			theConductorContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ConductorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for subjectURI tag ");
		}
	}
}

