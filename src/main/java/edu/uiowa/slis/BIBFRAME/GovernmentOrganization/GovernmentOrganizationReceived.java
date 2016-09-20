package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationReceivedIterator theGovernmentOrganizationReceivedIterator = (GovernmentOrganizationReceivedIterator)findAncestorWithClass(this, GovernmentOrganizationReceivedIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for received tag ");
		}
		return SKIP_BODY;
	}
}

