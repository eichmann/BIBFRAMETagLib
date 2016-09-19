package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHeldByInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentHeldByInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHeldByInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHeldByInverseIterator theAgentHeldByInverseIterator = (AgentHeldByInverseIterator)findAncestorWithClass(this, AgentHeldByInverseIterator.class);
			pageContext.getOut().print(theAgentHeldByInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

