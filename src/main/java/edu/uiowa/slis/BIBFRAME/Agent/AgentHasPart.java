package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasPartIterator theAgentHasPartIterator = (AgentHasPartIterator)findAncestorWithClass(this, AgentHasPartIterator.class);
			pageContext.getOut().print(theAgentHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

