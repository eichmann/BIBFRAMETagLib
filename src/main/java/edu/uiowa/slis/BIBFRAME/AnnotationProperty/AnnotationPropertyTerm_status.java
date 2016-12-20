package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyTerm_status extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertyTerm_status currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyTerm_status.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyTerm_statusIterator theAnnotationProperty = (AnnotationPropertyTerm_statusIterator)findAncestorWithClass(this, AnnotationPropertyTerm_statusIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getTerm_status());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for term_status tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for term_status tag ");
		}
		return SKIP_BODY;
	}
}

