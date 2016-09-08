package edu.uiowa.slis.BIBFRAME.ManufacturerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManufacturerProvisionMadeAvailable extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManufacturerProvisionMadeAvailable currentInstance = null;
	private static final Log log = LogFactory.getLog(ManufacturerProvisionMadeAvailable.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManufacturerProvisionMadeAvailableIterator theManufacturerProvisionMadeAvailableIterator = (ManufacturerProvisionMadeAvailableIterator)findAncestorWithClass(this, ManufacturerProvisionMadeAvailableIterator.class);
			pageContext.getOut().print(theManufacturerProvisionMadeAvailableIterator.getMadeAvailable());
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for madeAvailable tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for madeAvailable tag ");
		}
		return SKIP_BODY;
	}
}

