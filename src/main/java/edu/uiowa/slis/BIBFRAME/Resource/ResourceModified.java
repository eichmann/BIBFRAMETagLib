package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceModified extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceModifiedIterator theResource = (ResourceModifiedIterator)findAncestorWithClass(this, ResourceModifiedIterator.class);
			pageContext.getOut().print(theResource.getModified());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for modified tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for modified tag ");
		}
		return SKIP_BODY;
	}
}

