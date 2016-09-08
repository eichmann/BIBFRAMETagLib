package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationIsAnnotatorOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationIsAnnotatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationIsAnnotatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationIsAnnotatorOfIterator theGovernmentOrganizationIsAnnotatorOfIterator = (GovernmentOrganizationIsAnnotatorOfIterator)findAncestorWithClass(this, GovernmentOrganizationIsAnnotatorOfIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationIsAnnotatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for isAnnotatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for isAnnotatorOf tag ");
		}
		return SKIP_BODY;
	}
}

