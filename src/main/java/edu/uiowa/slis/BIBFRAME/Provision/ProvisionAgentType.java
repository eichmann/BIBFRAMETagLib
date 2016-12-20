package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProvisionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProvisionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProvisionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProvisionAgentIterator theProvisionAgentIterator = (ProvisionAgentIterator)findAncestorWithClass(this, ProvisionAgentIterator.class);
			pageContext.getOut().print(theProvisionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for agent tag ");
		}
		return SKIP_BODY;
	}
}

