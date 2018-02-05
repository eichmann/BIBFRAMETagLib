package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertySeeAlso extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertySeeAlso currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertySeeAlso.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertySeeAlsoIterator theAnnotationProperty = (AnnotationPropertySeeAlsoIterator)findAncestorWithClass(this, AnnotationPropertySeeAlsoIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getSeeAlso());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for seeAlso tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for seeAlso tag ");
		}
		return SKIP_BODY;
	}
}

