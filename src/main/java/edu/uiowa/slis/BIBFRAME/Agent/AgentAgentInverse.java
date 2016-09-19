package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentAgentInverseIterator theAgentAgentInverseIterator = (AgentAgentInverseIterator)findAncestorWithClass(this, AgentAgentInverseIterator.class);
			pageContext.getOut().print(theAgentAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for agent tag ");
		}
		return SKIP_BODY;
	}
}

