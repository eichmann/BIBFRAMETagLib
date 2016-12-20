package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(EventFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventFollowsIterator theEventFollowsIterator = (EventFollowsIterator)findAncestorWithClass(this, EventFollowsIterator.class);
			pageContext.getOut().print(theEventFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for follows tag ");
		}
		return SKIP_BODY;
	}
}

