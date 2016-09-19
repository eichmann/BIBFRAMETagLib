package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHeldByInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationHeldByInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHeldByInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHeldByInverseIterator theOrganizationHeldByInverseIterator = (OrganizationHeldByInverseIterator)findAncestorWithClass(this, OrganizationHeldByInverseIterator.class);
			pageContext.getOut().print(theOrganizationHeldByInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

