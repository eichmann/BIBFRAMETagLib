package edu.uiowa.slis.BIBFRAME.DistributorProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistributorProvisionAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistributorProvisionAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(DistributorProvisionAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistributorProvisionAtLocationIterator theDistributorProvisionAtLocationIterator = (DistributorProvisionAtLocationIterator)findAncestorWithClass(this, DistributorProvisionAtLocationIterator.class);
			pageContext.getOut().print(theDistributorProvisionAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

