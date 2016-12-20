package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasPartIterator theEventHasPartIterator = (EventHasPartIterator)findAncestorWithClass(this, EventHasPartIterator.class);
			pageContext.getOut().print(theEventHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

