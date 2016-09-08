package edu.uiowa.slis.BIBFRAME.ManufacturerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManufacturerProvisionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManufacturerProvisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ManufacturerProvisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ManufacturerProvision theManufacturerProvision = (ManufacturerProvision)findAncestorWithClass(this, ManufacturerProvision.class);
			if (!theManufacturerProvision.commitNeeded) {
				pageContext.getOut().print(theManufacturerProvision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ManufacturerProvision theManufacturerProvision = (ManufacturerProvision)findAncestorWithClass(this, ManufacturerProvision.class);
			return theManufacturerProvision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ManufacturerProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ManufacturerProvision theManufacturerProvision = (ManufacturerProvision)findAncestorWithClass(this, ManufacturerProvision.class);
			theManufacturerProvision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for label tag ");
		}
	}
}

