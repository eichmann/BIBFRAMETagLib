package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasPartIterator theOrganizationHasPartIterator = (OrganizationHasPartIterator)findAncestorWithClass(this, OrganizationHasPartIterator.class);
			pageContext.getOut().print(theOrganizationHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

