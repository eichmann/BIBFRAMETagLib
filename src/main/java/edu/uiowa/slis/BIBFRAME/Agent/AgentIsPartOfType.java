package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIsPartOfIterator theAgentIsPartOfIterator = (AgentIsPartOfIterator)findAncestorWithClass(this, AgentIsPartOfIterator.class);
			pageContext.getOut().print(theAgentIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

