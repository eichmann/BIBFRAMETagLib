package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceVersionInfo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceVersionInfo currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceVersionInfo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceVersionInfoIterator theResource = (ResourceVersionInfoIterator)findAncestorWithClass(this, ResourceVersionInfoIterator.class);
			pageContext.getOut().print(theResource.getVersionInfo());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for versionInfo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for versionInfo tag ");
		}
		return SKIP_BODY;
	}
}

