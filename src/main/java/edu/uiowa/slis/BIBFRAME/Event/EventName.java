package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventName currentInstance = null;
	private static final Log log = LogFactory.getLog(EventName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameIterator theEvent = (EventNameIterator)findAncestorWithClass(this, EventNameIterator.class);
			pageContext.getOut().print(theEvent.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for name tag ");
		}
		return SKIP_BODY;
	}
}

