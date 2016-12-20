package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentAccompaniesIterator theAgentAccompaniesIterator = (AgentAccompaniesIterator)findAncestorWithClass(this, AgentAccompaniesIterator.class);
			pageContext.getOut().print(theAgentAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

