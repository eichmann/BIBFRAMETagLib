package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRelationIterator theAgentRelationIterator = (AgentRelationIterator)findAncestorWithClass(this, AgentRelationIterator.class);
			pageContext.getOut().print(theAgentRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for relation tag ");
		}
		return SKIP_BODY;
	}
}

