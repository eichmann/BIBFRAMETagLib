package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationPrecedesIterator theOrganizationPrecedesIterator = (OrganizationPrecedesIterator)findAncestorWithClass(this, OrganizationPrecedesIterator.class);
			pageContext.getOut().print(theOrganizationPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for precedes tag ");
		}
		return SKIP_BODY;
	}
}

