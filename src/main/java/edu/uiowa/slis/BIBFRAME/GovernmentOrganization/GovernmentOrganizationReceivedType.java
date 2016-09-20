package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationReceivedIterator theGovernmentOrganizationReceivedIterator = (GovernmentOrganizationReceivedIterator)findAncestorWithClass(this, GovernmentOrganizationReceivedIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for received tag ");
		}
		return SKIP_BODY;
	}
}

