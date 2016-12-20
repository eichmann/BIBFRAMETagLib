package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasAnnotationIterator theThingHasAnnotationIterator = (ThingHasAnnotationIterator)findAncestorWithClass(this, ThingHasAnnotationIterator.class);
			pageContext.getOut().print(theThingHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

