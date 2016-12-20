package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAccompaniedByIterator theOrganizationAccompaniedByIterator = (OrganizationAccompaniedByIterator)findAncestorWithClass(this, OrganizationAccompaniedByIterator.class);
			pageContext.getOut().print(theOrganizationAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

