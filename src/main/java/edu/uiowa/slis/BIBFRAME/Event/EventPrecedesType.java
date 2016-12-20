package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventPrecedesIterator theEventPrecedesIterator = (EventPrecedesIterator)findAncestorWithClass(this, EventPrecedesIterator.class);
			pageContext.getOut().print(theEventPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for precedes tag ");
		}
		return SKIP_BODY;
	}
}

