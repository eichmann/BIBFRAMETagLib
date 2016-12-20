package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingHasPartIterator theMeetingHasPartIterator = (MeetingHasPartIterator)findAncestorWithClass(this, MeetingHasPartIterator.class);
			pageContext.getOut().print(theMeetingHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

