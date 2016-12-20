package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAccompaniesIterator theOrganizationAccompaniesIterator = (OrganizationAccompaniesIterator)findAncestorWithClass(this, OrganizationAccompaniesIterator.class);
			pageContext.getOut().print(theOrganizationAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

