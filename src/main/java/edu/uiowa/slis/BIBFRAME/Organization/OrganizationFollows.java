package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationFollowsIterator theOrganizationFollowsIterator = (OrganizationFollowsIterator)findAncestorWithClass(this, OrganizationFollowsIterator.class);
			pageContext.getOut().print(theOrganizationFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for follows tag ");
		}
		return SKIP_BODY;
	}
}

