package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventPrecedesIterator theEventPrecedesIterator = (EventPrecedesIterator)findAncestorWithClass(this, EventPrecedesIterator.class);
			pageContext.getOut().print(theEventPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for precedes tag ");
		}
		return SKIP_BODY;
	}
}

