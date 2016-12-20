package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAccompaniedByIterator theOrganizationAccompaniedByIterator = (OrganizationAccompaniedByIterator)findAncestorWithClass(this, OrganizationAccompaniedByIterator.class);
			pageContext.getOut().print(theOrganizationAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

