package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceHasAnnotationIterator theResourceHasAnnotationIterator = (ResourceHasAnnotationIterator)findAncestorWithClass(this, ResourceHasAnnotationIterator.class);
			pageContext.getOut().print(theResourceHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

