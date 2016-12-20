package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingPrecedesIterator theMeetingPrecedesIterator = (MeetingPrecedesIterator)findAncestorWithClass(this, MeetingPrecedesIterator.class);
			pageContext.getOut().print(theMeetingPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for precedes tag ");
		}
		return SKIP_BODY;
	}
}

