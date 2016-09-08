package edu.uiowa.slis.BIBFRAME.ManufacturerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManufacturerProvisionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManufacturerProvisionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManufacturerProvisionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManufacturerProvisionAgentIterator theManufacturerProvisionAgentIterator = (ManufacturerProvisionAgentIterator)findAncestorWithClass(this, ManufacturerProvisionAgentIterator.class);
			pageContext.getOut().print(theManufacturerProvisionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for agent tag ");
		}
		return SKIP_BODY;
	}
}

