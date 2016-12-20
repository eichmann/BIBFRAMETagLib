package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentPrecedesIterator theAgentPrecedesIterator = (AgentPrecedesIterator)findAncestorWithClass(this, AgentPrecedesIterator.class);
			pageContext.getOut().print(theAgentPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for precedes tag ");
		}
		return SKIP_BODY;
	}
}

