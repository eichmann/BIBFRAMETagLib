package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAccompaniesIterator theOrganizationAccompaniesIterator = (OrganizationAccompaniesIterator)findAncestorWithClass(this, OrganizationAccompaniesIterator.class);
			pageContext.getOut().print(theOrganizationAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

