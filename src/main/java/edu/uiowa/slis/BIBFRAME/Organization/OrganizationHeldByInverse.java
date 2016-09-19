package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHeldByInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationHeldByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHeldByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHeldByInverseIterator theOrganizationHeldByInverseIterator = (OrganizationHeldByInverseIterator)findAncestorWithClass(this, OrganizationHeldByInverseIterator.class);
			pageContext.getOut().print(theOrganizationHeldByInverseIterator.getHeldByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

