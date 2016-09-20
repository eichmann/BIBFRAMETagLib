package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationHeldByInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationHeldByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationHeldByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationHeldByInverseIterator theGovernmentOrganizationHeldByInverseIterator = (GovernmentOrganizationHeldByInverseIterator)findAncestorWithClass(this, GovernmentOrganizationHeldByInverseIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationHeldByInverseIterator.getHeldByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

