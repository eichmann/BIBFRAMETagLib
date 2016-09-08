package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			if (!theAnnotation.commitNeeded) {
				pageContext.getOut().print(theAnnotation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			return theAnnotation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Annotation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Annotation theAnnotation = (Annotation)findAncestorWithClass(this, Annotation.class);
			theAnnotation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Annotation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Annotation for label tag ");
		}
	}
}

