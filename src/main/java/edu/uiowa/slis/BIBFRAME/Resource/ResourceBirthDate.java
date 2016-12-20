package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceBirthDateIterator theResource = (ResourceBirthDateIterator)findAncestorWithClass(this, ResourceBirthDateIterator.class);
			pageContext.getOut().print(theResource.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

