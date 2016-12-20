package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MeetingBirthDateIterator theMeeting = (MeetingBirthDateIterator)findAncestorWithClass(this, MeetingBirthDateIterator.class);
			pageContext.getOut().print(theMeeting.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

