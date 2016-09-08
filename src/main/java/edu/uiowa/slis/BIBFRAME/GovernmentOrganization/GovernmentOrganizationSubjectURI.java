package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganization theGovernmentOrganization = (GovernmentOrganization)findAncestorWithClass(this, GovernmentOrganization.class);
			if (!theGovernmentOrganization.commitNeeded) {
				pageContext.getOut().print(theGovernmentOrganization.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GovernmentOrganization theGovernmentOrganization = (GovernmentOrganization)findAncestorWithClass(this, GovernmentOrganization.class);
			return theGovernmentOrganization.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GovernmentOrganization theGovernmentOrganization = (GovernmentOrganization)findAncestorWithClass(this, GovernmentOrganization.class);
			theGovernmentOrganization.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for subjectURI tag ");
		}
	}
}

