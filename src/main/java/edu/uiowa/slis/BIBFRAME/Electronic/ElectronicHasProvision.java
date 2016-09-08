package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasProvision extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasProvision currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasProvision.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasProvisionIterator theElectronicHasProvisionIterator = (ElectronicHasProvisionIterator)findAncestorWithClass(this, ElectronicHasProvisionIterator.class);
			pageContext.getOut().print(theElectronicHasProvisionIterator.getHasProvision());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasProvision tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasProvision tag ");
		}
		return SKIP_BODY;
	}
}

