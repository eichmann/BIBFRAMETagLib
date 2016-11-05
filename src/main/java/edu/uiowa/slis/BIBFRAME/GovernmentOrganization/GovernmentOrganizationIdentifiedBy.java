package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationIdentifiedByIterator theGovernmentOrganizationIdentifiedByIterator = (GovernmentOrganizationIdentifiedByIterator)findAncestorWithClass(this, GovernmentOrganizationIdentifiedByIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

