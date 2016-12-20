package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasAnnotationIterator theAgentHasAnnotationIterator = (AgentHasAnnotationIterator)findAncestorWithClass(this, AgentHasAnnotationIterator.class);
			pageContext.getOut().print(theAgentHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

