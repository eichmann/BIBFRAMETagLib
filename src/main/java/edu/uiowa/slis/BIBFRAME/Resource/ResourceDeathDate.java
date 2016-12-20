package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceDeathDateIterator theResource = (ResourceDeathDateIterator)findAncestorWithClass(this, ResourceDeathDateIterator.class);
			pageContext.getOut().print(theResource.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

