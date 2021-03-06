package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationMotivatedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationMotivatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationMotivatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AnnotationMotivatedByIterator theAnnotationMotivatedByIterator = (AnnotationMotivatedByIterator)findAncestorWithClass(this, AnnotationMotivatedByIterator.class);
			pageContext.getOut().print(theAnnotationMotivatedByIterator.getMotivatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for motivatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for motivatedBy tag ");
		}
		return SKIP_BODY;
	}
}

