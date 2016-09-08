package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationBirthDateIterator theOrganization = (OrganizationBirthDateIterator)findAncestorWithClass(this, OrganizationBirthDateIterator.class);
			pageContext.getOut().print(theOrganization.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

