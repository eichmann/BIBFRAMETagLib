package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceHasSourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceHasSourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceHasSourceStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceHasSourceStatusIterator theResourceHasSourceStatusIterator = (ResourceHasSourceStatusIterator)findAncestorWithClass(this, ResourceHasSourceStatusIterator.class);
			pageContext.getOut().print(theResourceHasSourceStatusIterator.getHasSourceStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

