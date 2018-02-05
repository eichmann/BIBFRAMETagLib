package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentName currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameIterator theAgent = (AgentNameIterator)findAncestorWithClass(this, AgentNameIterator.class);
			pageContext.getOut().print(theAgent.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for name tag ");
		}
		return SKIP_BODY;
	}
}

