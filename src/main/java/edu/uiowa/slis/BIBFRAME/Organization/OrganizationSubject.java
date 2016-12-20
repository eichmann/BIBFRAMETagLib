package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationSubjectIterator theOrganizationSubjectIterator = (OrganizationSubjectIterator)findAncestorWithClass(this, OrganizationSubjectIterator.class);
			pageContext.getOut().print(theOrganizationSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for subject tag ");
		}
		return SKIP_BODY;
	}
}

