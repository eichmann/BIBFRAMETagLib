package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationAgentInverseIterator theGovernmentOrganizationAgentInverseIterator = (GovernmentOrganizationAgentInverseIterator)findAncestorWithClass(this, GovernmentOrganizationAgentInverseIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for agent tag ");
		}
		return SKIP_BODY;
	}
}

