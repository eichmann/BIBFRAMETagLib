package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentLanguageIterator theAgentLanguageIterator = (AgentLanguageIterator)findAncestorWithClass(this, AgentLanguageIterator.class);
			pageContext.getOut().print(theAgentLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for language tag ");
		}
		return SKIP_BODY;
	}
}

