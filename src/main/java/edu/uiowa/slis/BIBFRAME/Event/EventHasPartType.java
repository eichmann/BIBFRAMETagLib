package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasPartIterator theEventHasPartIterator = (EventHasPartIterator)findAncestorWithClass(this, EventHasPartIterator.class);
			pageContext.getOut().print(theEventHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

