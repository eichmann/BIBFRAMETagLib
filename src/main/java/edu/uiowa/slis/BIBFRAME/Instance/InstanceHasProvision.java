package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasProvision extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasProvision currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasProvision.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasProvisionIterator theInstanceHasProvisionIterator = (InstanceHasProvisionIterator)findAncestorWithClass(this, InstanceHasProvisionIterator.class);
			pageContext.getOut().print(theInstanceHasProvisionIterator.getHasProvision());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasProvision tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasProvision tag ");
		}
		return SKIP_BODY;
	}
}

