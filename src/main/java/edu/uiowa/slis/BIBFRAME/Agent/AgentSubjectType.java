package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentSubjectIterator theAgentSubjectIterator = (AgentSubjectIterator)findAncestorWithClass(this, AgentSubjectIterator.class);
			pageContext.getOut().print(theAgentSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for subject tag ");
		}
		return SKIP_BODY;
	}
}

