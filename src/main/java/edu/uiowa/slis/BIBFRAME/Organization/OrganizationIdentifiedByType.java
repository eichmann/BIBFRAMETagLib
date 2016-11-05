package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIdentifiedByIterator theOrganizationIdentifiedByIterator = (OrganizationIdentifiedByIterator)findAncestorWithClass(this, OrganizationIdentifiedByIterator.class);
			pageContext.getOut().print(theOrganizationIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

