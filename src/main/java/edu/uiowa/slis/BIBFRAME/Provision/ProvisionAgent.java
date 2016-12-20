package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProvisionAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProvisionAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(ProvisionAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProvisionAgentIterator theProvisionAgentIterator = (ProvisionAgentIterator)findAncestorWithClass(this, ProvisionAgentIterator.class);
			pageContext.getOut().print(theProvisionAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for agent tag ");
		}
		return SKIP_BODY;
	}
}

