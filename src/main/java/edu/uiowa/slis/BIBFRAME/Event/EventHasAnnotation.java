package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasAnnotationIterator theEventHasAnnotationIterator = (EventHasAnnotationIterator)findAncestorWithClass(this, EventHasAnnotationIterator.class);
			pageContext.getOut().print(theEventHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

