package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIsSubjectOfIterator theAgentIsSubjectOfIterator = (AgentIsSubjectOfIterator)findAncestorWithClass(this, AgentIsSubjectOfIterator.class);
			pageContext.getOut().print(theAgentIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

