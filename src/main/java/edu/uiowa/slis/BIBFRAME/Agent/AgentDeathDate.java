package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentDeathDateIterator theAgent = (AgentDeathDateIterator)findAncestorWithClass(this, AgentDeathDateIterator.class);
			pageContext.getOut().print(theAgent.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

