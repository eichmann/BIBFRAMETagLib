package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAtLocationIterator theResourceAtLocationIterator = (ResourceAtLocationIterator)findAncestorWithClass(this, ResourceAtLocationIterator.class);
			pageContext.getOut().print(theResourceAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

