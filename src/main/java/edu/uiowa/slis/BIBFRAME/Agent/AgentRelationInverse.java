package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRelationInverseIterator theAgentRelationInverseIterator = (AgentRelationInverseIterator)findAncestorWithClass(this, AgentRelationInverseIterator.class);
			pageContext.getOut().print(theAgentRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for relation tag ");
		}
		return SKIP_BODY;
	}
}

