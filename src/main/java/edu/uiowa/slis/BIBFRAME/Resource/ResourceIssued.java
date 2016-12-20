package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceIssued extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceIssued currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceIssued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceIssuedIterator theResource = (ResourceIssuedIterator)findAncestorWithClass(this, ResourceIssuedIterator.class);
			pageContext.getOut().print(theResource.getIssued());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for issued tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for issued tag ");
		}
		return SKIP_BODY;
	}
}

