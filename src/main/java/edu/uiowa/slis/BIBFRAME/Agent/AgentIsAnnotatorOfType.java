package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIsAnnotatorOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentIsAnnotatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIsAnnotatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIsAnnotatorOfIterator theAgentIsAnnotatorOfIterator = (AgentIsAnnotatorOfIterator)findAncestorWithClass(this, AgentIsAnnotatorOfIterator.class);
			pageContext.getOut().print(theAgentIsAnnotatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for isAnnotatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for isAnnotatorOf tag ");
		}
		return SKIP_BODY;
	}
}

