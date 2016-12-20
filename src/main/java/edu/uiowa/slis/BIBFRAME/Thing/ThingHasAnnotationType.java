package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasAnnotationIterator theThingHasAnnotationIterator = (ThingHasAnnotationIterator)findAncestorWithClass(this, ThingHasAnnotationIterator.class);
			pageContext.getOut().print(theThingHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

