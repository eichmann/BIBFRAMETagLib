package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProvisionMadeAvailable extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProvisionMadeAvailable currentInstance = null;
	private static final Log log = LogFactory.getLog(ProvisionMadeAvailable.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProvisionMadeAvailableIterator theProvisionMadeAvailableIterator = (ProvisionMadeAvailableIterator)findAncestorWithClass(this, ProvisionMadeAvailableIterator.class);
			pageContext.getOut().print(theProvisionMadeAvailableIterator.getMadeAvailable());
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for madeAvailable tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for madeAvailable tag ");
		}
		return SKIP_BODY;
	}
}

