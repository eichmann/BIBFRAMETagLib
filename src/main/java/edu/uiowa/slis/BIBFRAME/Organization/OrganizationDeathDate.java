package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationDeathDateIterator theOrganization = (OrganizationDeathDateIterator)findAncestorWithClass(this, OrganizationDeathDateIterator.class);
			pageContext.getOut().print(theOrganization.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

