package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationProperty theAnnotationProperty = (AnnotationProperty)findAncestorWithClass(this, AnnotationProperty.class);
			if (!theAnnotationProperty.commitNeeded) {
				pageContext.getOut().print(theAnnotationProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AnnotationProperty theAnnotationProperty = (AnnotationProperty)findAncestorWithClass(this, AnnotationProperty.class);
			return theAnnotationProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AnnotationProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AnnotationProperty theAnnotationProperty = (AnnotationProperty)findAncestorWithClass(this, AnnotationProperty.class);
			theAnnotationProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for label tag ");
		}
	}
}

