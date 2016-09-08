package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationBirthDateIterator theGovernmentOrganization = (GovernmentOrganizationBirthDateIterator)findAncestorWithClass(this, GovernmentOrganizationBirthDateIterator.class);
			pageContext.getOut().print(theGovernmentOrganization.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

