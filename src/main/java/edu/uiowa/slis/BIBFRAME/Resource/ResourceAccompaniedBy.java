package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAccompaniedByIterator theResourceAccompaniedByIterator = (ResourceAccompaniedByIterator)findAncestorWithClass(this, ResourceAccompaniedByIterator.class);
			pageContext.getOut().print(theResourceAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

