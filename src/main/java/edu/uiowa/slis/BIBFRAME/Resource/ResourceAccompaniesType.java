package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAccompaniesIterator theResourceAccompaniesIterator = (ResourceAccompaniesIterator)findAncestorWithClass(this, ResourceAccompaniesIterator.class);
			pageContext.getOut().print(theResourceAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

