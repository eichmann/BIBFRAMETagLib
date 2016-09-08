package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganization theGovernmentOrganization = (GovernmentOrganization)findAncestorWithClass(this, GovernmentOrganization.class);
			if (!theGovernmentOrganization.commitNeeded) {
				pageContext.getOut().print(theGovernmentOrganization.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GovernmentOrganization theGovernmentOrganization = (GovernmentOrganization)findAncestorWithClass(this, GovernmentOrganization.class);
			return theGovernmentOrganization.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GovernmentOrganization theGovernmentOrganization = (GovernmentOrganization)findAncestorWithClass(this, GovernmentOrganization.class);
			theGovernmentOrganization.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for label tag ");
		}
	}
}

