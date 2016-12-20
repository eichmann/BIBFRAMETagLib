package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationFollowsIterator theOrganizationFollowsIterator = (OrganizationFollowsIterator)findAncestorWithClass(this, OrganizationFollowsIterator.class);
			pageContext.getOut().print(theOrganizationFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for follows tag ");
		}
		return SKIP_BODY;
	}
}

