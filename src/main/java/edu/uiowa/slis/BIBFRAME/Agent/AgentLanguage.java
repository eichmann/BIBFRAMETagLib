package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentLanguageIterator theAgentLanguageIterator = (AgentLanguageIterator)findAncestorWithClass(this, AgentLanguageIterator.class);
			pageContext.getOut().print(theAgentLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for language tag ");
		}
		return SKIP_BODY;
	}
}

