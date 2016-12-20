package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceFollowsIterator theResourceFollowsIterator = (ResourceFollowsIterator)findAncestorWithClass(this, ResourceFollowsIterator.class);
			pageContext.getOut().print(theResourceFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for follows tag ");
		}
		return SKIP_BODY;
	}
}
