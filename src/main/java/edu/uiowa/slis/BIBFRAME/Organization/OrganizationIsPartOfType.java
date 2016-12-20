package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIsPartOfIterator theOrganizationIsPartOfIterator = (OrganizationIsPartOfIterator)findAncestorWithClass(this, OrganizationIsPartOfIterator.class);
			pageContext.getOut().print(theOrganizationIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

