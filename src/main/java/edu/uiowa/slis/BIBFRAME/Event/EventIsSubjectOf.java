package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EventIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventIsSubjectOfIterator theEventIsSubjectOfIterator = (EventIsSubjectOfIterator)findAncestorWithClass(this, EventIsSubjectOfIterator.class);
			pageContext.getOut().print(theEventIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

