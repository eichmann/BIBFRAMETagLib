package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceName currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceNameIterator theResource = (ResourceNameIterator)findAncestorWithClass(this, ResourceNameIterator.class);
			pageContext.getOut().print(theResource.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for name tag ");
		}
		return SKIP_BODY;
	}
}

