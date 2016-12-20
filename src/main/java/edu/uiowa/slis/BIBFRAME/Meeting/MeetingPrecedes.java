package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingPrecedesIterator theMeetingPrecedesIterator = (MeetingPrecedesIterator)findAncestorWithClass(this, MeetingPrecedesIterator.class);
			pageContext.getOut().print(theMeetingPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for precedes tag ");
		}
		return SKIP_BODY;
	}
}

