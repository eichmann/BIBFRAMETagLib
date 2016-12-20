package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyDefinition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertyDefinition currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyDefinition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyDefinitionIterator theAnnotationProperty = (AnnotationPropertyDefinitionIterator)findAncestorWithClass(this, AnnotationPropertyDefinitionIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getDefinition());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for definition tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for definition tag ");
		}
		return SKIP_BODY;
	}
}

