package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceIsBodyOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceIsBodyOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceIsBodyOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceIsBodyOfIterator theResourceIsBodyOfIterator = (ResourceIsBodyOfIterator)findAncestorWithClass(this, ResourceIsBodyOfIterator.class);
			pageContext.getOut().print(theResourceIsBodyOfIterator.getIsBodyOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for isBodyOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for isBodyOf tag ");
		}
		return SKIP_BODY;
	}
}

