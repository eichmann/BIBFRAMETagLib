package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourcePrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourcePrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourcePrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourcePrecedesIterator theResourcePrecedesIterator = (ResourcePrecedesIterator)findAncestorWithClass(this, ResourcePrecedesIterator.class);
			pageContext.getOut().print(theResourcePrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for precedes tag ");
		}
		return SKIP_BODY;
	}
}

