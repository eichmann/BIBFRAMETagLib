package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceIdentifiedByIterator theResourceIdentifiedByIterator = (ResourceIdentifiedByIterator)findAncestorWithClass(this, ResourceIdentifiedByIterator.class);
			pageContext.getOut().print(theResourceIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

