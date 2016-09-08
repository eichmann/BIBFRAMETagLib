package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingPerformanceOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingPerformanceOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingPerformanceOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingPerformanceOfIterator theMeetingPerformanceOfIterator = (MeetingPerformanceOfIterator)findAncestorWithClass(this, MeetingPerformanceOfIterator.class);
			pageContext.getOut().print(theMeetingPerformanceOfIterator.getPerformanceOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for performanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for performanceOf tag ");
		}
		return SKIP_BODY;
	}
}

