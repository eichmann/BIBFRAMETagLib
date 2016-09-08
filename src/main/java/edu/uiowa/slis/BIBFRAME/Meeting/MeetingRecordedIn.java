package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingRecordedIn extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingRecordedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingRecordedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingRecordedInIterator theMeetingRecordedInIterator = (MeetingRecordedInIterator)findAncestorWithClass(this, MeetingRecordedInIterator.class);
			pageContext.getOut().print(theMeetingRecordedInIterator.getRecordedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for recordedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for recordedIn tag ");
		}
		return SKIP_BODY;
	}
}

