package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventAtLocationIterator theEventAtLocationIterator = (EventAtLocationIterator)findAncestorWithClass(this, EventAtLocationIterator.class);
			pageContext.getOut().print(theEventAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

