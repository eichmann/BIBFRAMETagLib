package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceInSchemeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceInSchemeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceInSchemeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceInSchemeIterator theResourceInSchemeIterator = (ResourceInSchemeIterator)findAncestorWithClass(this, ResourceInSchemeIterator.class);
			pageContext.getOut().print(theResourceInSchemeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

