package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationReceivedIterator theOrganizationReceivedIterator = (OrganizationReceivedIterator)findAncestorWithClass(this, OrganizationReceivedIterator.class);
			pageContext.getOut().print(theOrganizationReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for received tag ");
		}
		return SKIP_BODY;
	}
}

