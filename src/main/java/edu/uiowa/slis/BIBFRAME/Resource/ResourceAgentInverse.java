package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAgentInverseIterator theResourceAgentInverseIterator = (ResourceAgentInverseIterator)findAncestorWithClass(this, ResourceAgentInverseIterator.class);
			pageContext.getOut().print(theResourceAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for agent tag ");
		}
		return SKIP_BODY;
	}
}

