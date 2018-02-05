package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyLabelIterator theAnnotationProperty = (AnnotationPropertyLabelIterator)findAncestorWithClass(this, AnnotationPropertyLabelIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for label tag ");
		}
		return SKIP_BODY;
	}
}

