package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyIsDefinedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertyIsDefinedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyIsDefinedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyIsDefinedByIterator theAnnotationProperty = (AnnotationPropertyIsDefinedByIterator)findAncestorWithClass(this, AnnotationPropertyIsDefinedByIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getIsDefinedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for isDefinedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for isDefinedBy tag ");
		}
		return SKIP_BODY;
	}
}

