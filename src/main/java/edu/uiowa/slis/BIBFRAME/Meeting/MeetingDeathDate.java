package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MeetingDeathDateIterator theMeeting = (MeetingDeathDateIterator)findAncestorWithClass(this, MeetingDeathDateIterator.class);
			pageContext.getOut().print(theMeeting.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

