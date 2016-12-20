package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIsSubjectOfIterator theAgentIsSubjectOfIterator = (AgentIsSubjectOfIterator)findAncestorWithClass(this, AgentIsSubjectOfIterator.class);
			pageContext.getOut().print(theAgentIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

