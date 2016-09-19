package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationIsSubjectOfIterator theGovernmentOrganizationIsSubjectOfIterator = (GovernmentOrganizationIsSubjectOfIterator)findAncestorWithClass(this, GovernmentOrganizationIsSubjectOfIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

