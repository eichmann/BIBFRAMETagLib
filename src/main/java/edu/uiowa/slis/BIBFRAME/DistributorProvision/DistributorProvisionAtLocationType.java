package edu.uiowa.slis.BIBFRAME.DistributorProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistributorProvisionAtLocationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistributorProvisionAtLocationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DistributorProvisionAtLocationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistributorProvisionAtLocationIterator theDistributorProvisionAtLocationIterator = (DistributorProvisionAtLocationIterator)findAncestorWithClass(this, DistributorProvisionAtLocationIterator.class);
			pageContext.getOut().print(theDistributorProvisionAtLocationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

