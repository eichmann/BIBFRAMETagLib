package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationProperty theAnnotationProperty = (AnnotationProperty)findAncestorWithClass(this, AnnotationProperty.class);
			if (!theAnnotationProperty.commitNeeded) {
				pageContext.getOut().print(theAnnotationProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AnnotationProperty theAnnotationProperty = (AnnotationProperty)findAncestorWithClass(this, AnnotationProperty.class);
			return theAnnotationProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AnnotationProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AnnotationProperty theAnnotationProperty = (AnnotationProperty)findAncestorWithClass(this, AnnotationProperty.class);
			theAnnotationProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for subjectURI tag ");
		}
	}
}

