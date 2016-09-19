package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingAtLocationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingAtLocationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingAtLocationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingAtLocationIterator theMeetingAtLocationIterator = (MeetingAtLocationIterator)findAncestorWithClass(this, MeetingAtLocationIterator.class);
			pageContext.getOut().print(theMeetingAtLocationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

