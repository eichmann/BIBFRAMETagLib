package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationDeathDateIterator theGovernmentOrganization = (GovernmentOrganizationDeathDateIterator)findAncestorWithClass(this, GovernmentOrganizationDeathDateIterator.class);
			pageContext.getOut().print(theGovernmentOrganization.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

