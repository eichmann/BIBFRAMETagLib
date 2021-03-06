package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceHasPartIterator theResourceHasPartIterator = (ResourceHasPartIterator)findAncestorWithClass(this, ResourceHasPartIterator.class);
			pageContext.getOut().print(theResourceHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

