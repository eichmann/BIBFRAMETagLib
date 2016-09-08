package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationIsAnnotatorOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationIsAnnotatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationIsAnnotatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationIsAnnotatorOfIterator theGovernmentOrganizationIsAnnotatorOfIterator = (GovernmentOrganizationIsAnnotatorOfIterator)findAncestorWithClass(this, GovernmentOrganizationIsAnnotatorOfIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationIsAnnotatorOfIterator.getIsAnnotatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for isAnnotatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for isAnnotatorOf tag ");
		}
		return SKIP_BODY;
	}
}

