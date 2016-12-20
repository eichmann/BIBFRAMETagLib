package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventSubjectIterator theEventSubjectIterator = (EventSubjectIterator)findAncestorWithClass(this, EventSubjectIterator.class);
			pageContext.getOut().print(theEventSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for subject tag ");
		}
		return SKIP_BODY;
	}
}

