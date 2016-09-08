package edu.uiowa.slis.BIBFRAME.DistributorProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistributorProvisionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistributorProvisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DistributorProvisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DistributorProvision theDistributorProvision = (DistributorProvision)findAncestorWithClass(this, DistributorProvision.class);
			if (!theDistributorProvision.commitNeeded) {
				pageContext.getOut().print(theDistributorProvision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DistributorProvision theDistributorProvision = (DistributorProvision)findAncestorWithClass(this, DistributorProvision.class);
			return theDistributorProvision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DistributorProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DistributorProvision theDistributorProvision = (DistributorProvision)findAncestorWithClass(this, DistributorProvision.class);
			theDistributorProvision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for label tag ");
		}
	}
}

