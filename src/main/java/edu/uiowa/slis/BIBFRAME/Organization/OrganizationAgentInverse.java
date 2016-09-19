package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAgentInverseIterator theOrganizationAgentInverseIterator = (OrganizationAgentInverseIterator)findAncestorWithClass(this, OrganizationAgentInverseIterator.class);
			pageContext.getOut().print(theOrganizationAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for agent tag ");
		}
		return SKIP_BODY;
	}
}

