package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(EventDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventDeathDateIterator theEvent = (EventDeathDateIterator)findAncestorWithClass(this, EventDeathDateIterator.class);
			pageContext.getOut().print(theEvent.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

