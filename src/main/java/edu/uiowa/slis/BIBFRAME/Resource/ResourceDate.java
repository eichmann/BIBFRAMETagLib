package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceDateIterator theResource = (ResourceDateIterator)findAncestorWithClass(this, ResourceDateIterator.class);
			pageContext.getOut().print(theResource.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for date tag ");
		}
		return SKIP_BODY;
	}
}

