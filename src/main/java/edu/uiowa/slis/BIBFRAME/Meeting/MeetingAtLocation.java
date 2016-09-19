package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingAtLocationIterator theMeetingAtLocationIterator = (MeetingAtLocationIterator)findAncestorWithClass(this, MeetingAtLocationIterator.class);
			pageContext.getOut().print(theMeetingAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

