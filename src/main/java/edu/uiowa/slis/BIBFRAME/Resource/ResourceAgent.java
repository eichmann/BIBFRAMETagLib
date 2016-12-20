package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAgentIterator theResourceAgentIterator = (ResourceAgentIterator)findAncestorWithClass(this, ResourceAgentIterator.class);
			pageContext.getOut().print(theResourceAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for agent tag ");
		}
		return SKIP_BODY;
	}
}

