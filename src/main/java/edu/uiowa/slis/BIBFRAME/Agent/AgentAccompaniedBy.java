package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentAccompaniedByIterator theAgentAccompaniedByIterator = (AgentAccompaniedByIterator)findAncestorWithClass(this, AgentAccompaniedByIterator.class);
			pageContext.getOut().print(theAgentAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

