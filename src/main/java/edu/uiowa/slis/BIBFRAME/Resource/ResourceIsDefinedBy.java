package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceIsDefinedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceIsDefinedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceIsDefinedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceIsDefinedByIterator theResource = (ResourceIsDefinedByIterator)findAncestorWithClass(this, ResourceIsDefinedByIterator.class);
			pageContext.getOut().print(theResource.getIsDefinedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for isDefinedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for isDefinedBy tag ");
		}
		return SKIP_BODY;
	}
}

