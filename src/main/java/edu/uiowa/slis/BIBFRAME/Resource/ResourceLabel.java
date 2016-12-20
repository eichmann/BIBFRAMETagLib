package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceLabelIterator theResource = (ResourceLabelIterator)findAncestorWithClass(this, ResourceLabelIterator.class);
			pageContext.getOut().print(theResource.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for label tag ");
		}
		return SKIP_BODY;
	}
}

