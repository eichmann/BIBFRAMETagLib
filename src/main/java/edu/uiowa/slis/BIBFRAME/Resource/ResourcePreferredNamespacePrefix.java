package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourcePreferredNamespacePrefix extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourcePreferredNamespacePrefix currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourcePreferredNamespacePrefix.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourcePreferredNamespacePrefixIterator theResource = (ResourcePreferredNamespacePrefixIterator)findAncestorWithClass(this, ResourcePreferredNamespacePrefixIterator.class);
			pageContext.getOut().print(theResource.getPreferredNamespacePrefix());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for preferredNamespacePrefix tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for preferredNamespacePrefix tag ");
		}
		return SKIP_BODY;
	}
}

