package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceIsSubjectOfIterator theResourceIsSubjectOfIterator = (ResourceIsSubjectOfIterator)findAncestorWithClass(this, ResourceIsSubjectOfIterator.class);
			pageContext.getOut().print(theResourceIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

