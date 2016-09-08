package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIdentifiedByIterator theAgentIdentifiedByIterator = (AgentIdentifiedByIterator)findAncestorWithClass(this, AgentIdentifiedByIterator.class);
			pageContext.getOut().print(theAgentIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

