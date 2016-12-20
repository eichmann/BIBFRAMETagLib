package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceDefinition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceDefinition currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceDefinition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceDefinitionIterator theResource = (ResourceDefinitionIterator)findAncestorWithClass(this, ResourceDefinitionIterator.class);
			pageContext.getOut().print(theResource.getDefinition());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for definition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for definition tag ");
		}
		return SKIP_BODY;
	}
}

