package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceSeeAlso extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceSeeAlso currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceSeeAlso.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceSeeAlsoIterator theResource = (ResourceSeeAlsoIterator)findAncestorWithClass(this, ResourceSeeAlsoIterator.class);
			pageContext.getOut().print(theResource.getSeeAlso());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for seeAlso tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for seeAlso tag ");
		}
		return SKIP_BODY;
	}
}

