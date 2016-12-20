package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAgentInverseIterator theResourceAgentInverseIterator = (ResourceAgentInverseIterator)findAncestorWithClass(this, ResourceAgentInverseIterator.class);
			pageContext.getOut().print(theResourceAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for agent tag ");
		}
		return SKIP_BODY;
	}
}

