package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasAnnotationIterator theOrganizationHasAnnotationIterator = (OrganizationHasAnnotationIterator)findAncestorWithClass(this, OrganizationHasAnnotationIterator.class);
			pageContext.getOut().print(theOrganizationHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

