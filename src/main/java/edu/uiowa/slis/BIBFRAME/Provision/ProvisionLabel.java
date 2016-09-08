package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProvisionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProvisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ProvisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Provision theProvision = (Provision)findAncestorWithClass(this, Provision.class);
			if (!theProvision.commitNeeded) {
				pageContext.getOut().print(theProvision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Provision theProvision = (Provision)findAncestorWithClass(this, Provision.class);
			return theProvision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Provision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Provision theProvision = (Provision)findAncestorWithClass(this, Provision.class);
			theProvision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for label tag ");
		}
	}
}

