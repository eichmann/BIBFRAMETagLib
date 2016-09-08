package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationAnnotatedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationAnnotatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationAnnotatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AnnotationAnnotatedByIterator theAnnotationAnnotatedByIterator = (AnnotationAnnotatedByIterator)findAncestorWithClass(this, AnnotationAnnotatedByIterator.class);
			pageContext.getOut().print(theAnnotationAnnotatedByIterator.getAnnotatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for annotatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for annotatedBy tag ");
		}
		return SKIP_BODY;
	}
}

