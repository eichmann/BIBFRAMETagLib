package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentBirthDateIterator theAgent = (AgentBirthDateIterator)findAncestorWithClass(this, AgentBirthDateIterator.class);
			pageContext.getOut().print(theAgent.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

