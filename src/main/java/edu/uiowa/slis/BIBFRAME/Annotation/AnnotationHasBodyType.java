package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationHasBodyType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationHasBodyType currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationHasBodyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AnnotationHasBodyIterator theAnnotationHasBodyIterator = (AnnotationHasBodyIterator)findAncestorWithClass(this, AnnotationHasBodyIterator.class);
			pageContext.getOut().print(theAnnotationHasBodyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for hasBody tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for hasBody tag ");
		}
		return SKIP_BODY;
	}
}

