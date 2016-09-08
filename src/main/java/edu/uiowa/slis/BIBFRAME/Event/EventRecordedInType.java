package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRecordedInType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventRecordedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRecordedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRecordedInIterator theEventRecordedInIterator = (EventRecordedInIterator)findAncestorWithClass(this, EventRecordedInIterator.class);
			pageContext.getOut().print(theEventRecordedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for recordedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for recordedIn tag ");
		}
		return SKIP_BODY;
	}
}

