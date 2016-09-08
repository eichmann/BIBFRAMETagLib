package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIsAnnotatorOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentIsAnnotatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIsAnnotatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIsAnnotatorOfIterator theAgentIsAnnotatorOfIterator = (AgentIsAnnotatorOfIterator)findAncestorWithClass(this, AgentIsAnnotatorOfIterator.class);
			pageContext.getOut().print(theAgentIsAnnotatorOfIterator.getIsAnnotatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for isAnnotatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for isAnnotatorOf tag ");
		}
		return SKIP_BODY;
	}
}

