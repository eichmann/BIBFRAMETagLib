package edu.uiowa.slis.BIBFRAME.ManufacturerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManufacturerProvisionMadeAvailableType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManufacturerProvisionMadeAvailableType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManufacturerProvisionMadeAvailableType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManufacturerProvisionMadeAvailableIterator theManufacturerProvisionMadeAvailableIterator = (ManufacturerProvisionMadeAvailableIterator)findAncestorWithClass(this, ManufacturerProvisionMadeAvailableIterator.class);
			pageContext.getOut().print(theManufacturerProvisionMadeAvailableIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for madeAvailable tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for madeAvailable tag ");
		}
		return SKIP_BODY;
	}
}

