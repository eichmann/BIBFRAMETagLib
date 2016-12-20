package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceComment currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceCommentIterator theResource = (ResourceCommentIterator)findAncestorWithClass(this, ResourceCommentIterator.class);
			pageContext.getOut().print(theResource.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for comment tag ");
		}
		return SKIP_BODY;
	}
}

