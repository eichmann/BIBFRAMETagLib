package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EventIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventIsPartOfIterator theEventIsPartOfIterator = (EventIsPartOfIterator)findAncestorWithClass(this, EventIsPartOfIterator.class);
			pageContext.getOut().print(theEventIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

