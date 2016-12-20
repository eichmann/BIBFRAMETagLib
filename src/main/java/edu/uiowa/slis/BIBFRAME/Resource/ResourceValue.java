package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceValue extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceValue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceValueIterator theResource = (ResourceValueIterator)findAncestorWithClass(this, ResourceValueIterator.class);
			pageContext.getOut().print(theResource.getValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for value tag ");
		}
		return SKIP_BODY;
	}
}

