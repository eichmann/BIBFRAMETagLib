package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingRecordedInType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingRecordedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingRecordedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingRecordedInIterator theMeetingRecordedInIterator = (MeetingRecordedInIterator)findAncestorWithClass(this, MeetingRecordedInIterator.class);
			pageContext.getOut().print(theMeetingRecordedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for recordedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for recordedIn tag ");
		}
		return SKIP_BODY;
	}
}

