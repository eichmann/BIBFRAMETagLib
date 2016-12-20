package edu.uiowa.slis.BIBFRAME.DistributorProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistributorProvisionDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistributorProvisionDate currentInstance = null;
	private static final Log log = LogFactory.getLog(DistributorProvisionDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DistributorProvisionDateIterator theDistributorProvision = (DistributorProvisionDateIterator)findAncestorWithClass(this, DistributorProvisionDateIterator.class);
			pageContext.getOut().print(theDistributorProvision.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for date tag ");
		}
		return SKIP_BODY;
	}
}

