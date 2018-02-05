package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingName currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MeetingNameIterator theMeeting = (MeetingNameIterator)findAncestorWithClass(this, MeetingNameIterator.class);
			pageContext.getOut().print(theMeeting.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for name tag ");
		}
		return SKIP_BODY;
	}
}

