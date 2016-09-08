package edu.uiowa.slis.BIBFRAME.DistributorProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistributorProvisionMadeAvailable extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistributorProvisionMadeAvailable currentInstance = null;
	private static final Log log = LogFactory.getLog(DistributorProvisionMadeAvailable.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistributorProvisionMadeAvailableIterator theDistributorProvisionMadeAvailableIterator = (DistributorProvisionMadeAvailableIterator)findAncestorWithClass(this, DistributorProvisionMadeAvailableIterator.class);
			pageContext.getOut().print(theDistributorProvisionMadeAvailableIterator.getMadeAvailable());
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for madeAvailable tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for madeAvailable tag ");
		}
		return SKIP_BODY;
	}
}

