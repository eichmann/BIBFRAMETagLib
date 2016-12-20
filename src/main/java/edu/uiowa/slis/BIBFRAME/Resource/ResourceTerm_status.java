package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceTerm_status extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceTerm_status currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceTerm_status.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceTerm_statusIterator theResource = (ResourceTerm_statusIterator)findAncestorWithClass(this, ResourceTerm_statusIterator.class);
			pageContext.getOut().print(theResource.getTerm_status());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for term_status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for term_status tag ");
		}
		return SKIP_BODY;
	}
}

