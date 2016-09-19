package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentReceivedIterator theAgentReceivedIterator = (AgentReceivedIterator)findAncestorWithClass(this, AgentReceivedIterator.class);
			pageContext.getOut().print(theAgentReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for received tag ");
		}
		return SKIP_BODY;
	}
}

