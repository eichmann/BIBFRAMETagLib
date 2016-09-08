package edu.uiowa.slis.BIBFRAME.ManufacturerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManufacturerProvisionAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManufacturerProvisionAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(ManufacturerProvisionAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManufacturerProvisionAtLocationIterator theManufacturerProvisionAtLocationIterator = (ManufacturerProvisionAtLocationIterator)findAncestorWithClass(this, ManufacturerProvisionAtLocationIterator.class);
			pageContext.getOut().print(theManufacturerProvisionAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

