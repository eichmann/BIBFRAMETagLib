package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentAgentInverseIterator theAgentAgentInverseIterator = (AgentAgentInverseIterator)findAncestorWithClass(this, AgentAgentInverseIterator.class);
			pageContext.getOut().print(theAgentAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for agent tag ");
		}
		return SKIP_BODY;
	}
}

