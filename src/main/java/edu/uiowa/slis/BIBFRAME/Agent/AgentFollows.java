package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentFollowsIterator theAgentFollowsIterator = (AgentFollowsIterator)findAncestorWithClass(this, AgentFollowsIterator.class);
			pageContext.getOut().print(theAgentFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for follows tag ");
		}
		return SKIP_BODY;
	}
}

