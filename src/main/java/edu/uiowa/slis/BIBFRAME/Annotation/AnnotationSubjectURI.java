package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			if (!theAnnotation.commitNeeded) {
				pageContext.getOut().print(theAnnotation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			return theAnnotation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Annotation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			theAnnotation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for subjectURI tag ");
		}
	}
}

