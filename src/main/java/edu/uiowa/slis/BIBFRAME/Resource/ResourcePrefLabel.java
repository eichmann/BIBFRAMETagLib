package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourcePrefLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourcePrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourcePrefLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourcePrefLabelIterator theResource = (ResourcePrefLabelIterator)findAncestorWithClass(this, ResourcePrefLabelIterator.class);
			pageContext.getOut().print(theResource.getPrefLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for prefLabel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for prefLabel tag ");
		}
		return SKIP_BODY;
	}
}

