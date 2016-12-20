package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceIsPartOfIterator theResourceIsPartOfIterator = (ResourceIsPartOfIterator)findAncestorWithClass(this, ResourceIsPartOfIterator.class);
			pageContext.getOut().print(theResourceIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

