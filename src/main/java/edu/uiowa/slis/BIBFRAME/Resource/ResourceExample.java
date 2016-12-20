package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceExample extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceExample currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceExample.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceExampleIterator theResource = (ResourceExampleIterator)findAncestorWithClass(this, ResourceExampleIterator.class);
			pageContext.getOut().print(theResource.getExample());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for example tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for example tag ");
		}
		return SKIP_BODY;
	}
}

