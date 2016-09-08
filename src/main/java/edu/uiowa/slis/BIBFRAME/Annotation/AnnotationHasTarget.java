package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationHasTarget extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationHasTarget currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationHasTarget.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AnnotationHasTargetIterator theAnnotationHasTargetIterator = (AnnotationHasTargetIterator)findAncestorWithClass(this, AnnotationHasTargetIterator.class);
			pageContext.getOut().print(theAnnotationHasTargetIterator.getHasTarget());
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for hasTarget tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for hasTarget tag ");
		}
		return SKIP_BODY;
	}
}

