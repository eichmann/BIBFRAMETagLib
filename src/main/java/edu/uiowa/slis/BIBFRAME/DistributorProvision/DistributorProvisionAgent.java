package edu.uiowa.slis.BIBFRAME.DistributorProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistributorProvisionAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistributorProvisionAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(DistributorProvisionAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistributorProvisionAgentIterator theDistributorProvisionAgentIterator = (DistributorProvisionAgentIterator)findAncestorWithClass(this, DistributorProvisionAgentIterator.class);
			pageContext.getOut().print(theDistributorProvisionAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for agent tag ");
		}
		return SKIP_BODY;
	}
}

