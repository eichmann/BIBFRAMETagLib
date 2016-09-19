package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAtLocationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventAtLocationType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAtLocationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventAtLocationIterator theEventAtLocationIterator = (EventAtLocationIterator)findAncestorWithClass(this, EventAtLocationIterator.class);
			pageContext.getOut().print(theEventAtLocationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

