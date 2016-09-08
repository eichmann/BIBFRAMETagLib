package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPerformanceOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventPerformanceOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPerformanceOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventPerformanceOfIterator theEventPerformanceOfIterator = (EventPerformanceOfIterator)findAncestorWithClass(this, EventPerformanceOfIterator.class);
			pageContext.getOut().print(theEventPerformanceOfIterator.getPerformanceOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for performanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for performanceOf tag ");
		}
		return SKIP_BODY;
	}
}

