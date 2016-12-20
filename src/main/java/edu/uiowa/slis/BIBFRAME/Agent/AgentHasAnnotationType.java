package edu.uiowa.slis.BIBFRAME.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AgentHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasAnnotationIterator theAgentHasAnnotationIterator = (AgentHasAnnotationIterator)findAncestorWithClass(this, AgentHasAnnotationIterator.class);
			pageContext.getOut().print(theAgentHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

