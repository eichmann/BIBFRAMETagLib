package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIsAnnotatorOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationIsAnnotatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIsAnnotatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIsAnnotatorOfIterator theOrganizationIsAnnotatorOfIterator = (OrganizationIsAnnotatorOfIterator)findAncestorWithClass(this, OrganizationIsAnnotatorOfIterator.class);
			pageContext.getOut().print(theOrganizationIsAnnotatorOfIterator.getIsAnnotatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for isAnnotatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for isAnnotatorOf tag ");
		}
		return SKIP_BODY;
	}
}

