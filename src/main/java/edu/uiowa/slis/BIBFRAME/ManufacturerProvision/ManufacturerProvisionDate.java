package edu.uiowa.slis.BIBFRAME.ManufacturerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManufacturerProvisionDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManufacturerProvisionDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ManufacturerProvisionDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManufacturerProvisionDateIterator theManufacturerProvision = (ManufacturerProvisionDateIterator)findAncestorWithClass(this, ManufacturerProvisionDateIterator.class);
			pageContext.getOut().print(theManufacturerProvision.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for date tag ");
		}
		return SKIP_BODY;
	}
}

