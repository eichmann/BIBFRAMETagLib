package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventDate currentInstance = null;
	private static final Log log = LogFactory.getLog(EventDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventDateIterator theEvent = (EventDateIterator)findAncestorWithClass(this, EventDateIterator.class);
			pageContext.getOut().print(theEvent.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for date tag ");
		}
		return SKIP_BODY;
	}
}

