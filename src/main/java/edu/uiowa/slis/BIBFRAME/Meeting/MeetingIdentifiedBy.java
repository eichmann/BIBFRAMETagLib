package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingIdentifiedByIterator theMeetingIdentifiedByIterator = (MeetingIdentifiedByIterator)findAncestorWithClass(this, MeetingIdentifiedByIterator.class);
			pageContext.getOut().print(theMeetingIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

