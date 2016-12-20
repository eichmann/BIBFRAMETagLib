package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentAccompaniedByIterator theAgentAccompaniedByIterator = (AgentAccompaniedByIterator)findAncestorWithClass(this, AgentAccompaniedByIterator.class);
			pageContext.getOut().print(theAgentAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

