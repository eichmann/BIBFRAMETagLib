package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationAnnotatedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationAnnotatedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationAnnotatedAt.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			if (!theAnnotation.commitNeeded) {
				pageContext.getOut().print(theAnnotation.getAnnotatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for annotatedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for annotatedAt tag ");
		}
		return SKIP_BODY;
	}

	public String getAnnotatedAt() throws JspTagException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			return theAnnotation.getAnnotatedAt();
		} catch (Exception e) {
			log.error(" Can't find enclosing Annotation for annotatedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for annotatedAt tag ");
		}
	}

	public void setAnnotatedAt(String annotatedAt) throws JspTagException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			theAnnotation.setAnnotatedAt(annotatedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for annotatedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for annotatedAt tag ");
		}
	}
}

