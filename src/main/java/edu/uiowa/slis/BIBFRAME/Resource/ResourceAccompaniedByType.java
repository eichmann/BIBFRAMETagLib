package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAccompaniedByIterator theResourceAccompaniedByIterator = (ResourceAccompaniedByIterator)findAncestorWithClass(this, ResourceAccompaniedByIterator.class);
			pageContext.getOut().print(theResourceAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

