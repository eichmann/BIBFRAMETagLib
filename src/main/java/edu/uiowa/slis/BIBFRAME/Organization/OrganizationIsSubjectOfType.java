package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIsSubjectOfIterator theOrganizationIsSubjectOfIterator = (OrganizationIsSubjectOfIterator)findAncestorWithClass(this, OrganizationIsSubjectOfIterator.class);
			pageContext.getOut().print(theOrganizationIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

