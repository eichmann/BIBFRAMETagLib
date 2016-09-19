package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasAnnotationIterator theInstanceHasAnnotationIterator = (InstanceHasAnnotationIterator)findAncestorWithClass(this, InstanceHasAnnotationIterator.class);
			pageContext.getOut().print(theInstanceHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

