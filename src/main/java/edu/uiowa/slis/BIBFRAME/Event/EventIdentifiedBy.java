package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(EventIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventIdentifiedByIterator theEventIdentifiedByIterator = (EventIdentifiedByIterator)findAncestorWithClass(this, EventIdentifiedByIterator.class);
			pageContext.getOut().print(theEventIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

