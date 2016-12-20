package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceSubjectIterator theResourceSubjectIterator = (ResourceSubjectIterator)findAncestorWithClass(this, ResourceSubjectIterator.class);
			pageContext.getOut().print(theResourceSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for subject tag ");
		}
		return SKIP_BODY;
	}
}

