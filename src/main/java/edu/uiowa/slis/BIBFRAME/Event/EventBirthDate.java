package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(EventBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventBirthDateIterator theEvent = (EventBirthDateIterator)findAncestorWithClass(this, EventBirthDateIterator.class);
			pageContext.getOut().print(theEvent.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

