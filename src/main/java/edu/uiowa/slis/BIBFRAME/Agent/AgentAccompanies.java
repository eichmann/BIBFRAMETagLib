package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentAccompaniesIterator theAgentAccompaniesIterator = (AgentAccompaniesIterator)findAncestorWithClass(this, AgentAccompaniesIterator.class);
			pageContext.getOut().print(theAgentAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

