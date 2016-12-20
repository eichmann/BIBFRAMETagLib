package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingFollowsIterator theMeetingFollowsIterator = (MeetingFollowsIterator)findAncestorWithClass(this, MeetingFollowsIterator.class);
			pageContext.getOut().print(theMeetingFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for follows tag ");
		}
		return SKIP_BODY;
	}
}

