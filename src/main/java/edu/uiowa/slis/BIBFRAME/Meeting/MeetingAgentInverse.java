package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingAgentInverseIterator theMeetingAgentInverseIterator = (MeetingAgentInverseIterator)findAncestorWithClass(this, MeetingAgentInverseIterator.class);
			pageContext.getOut().print(theMeetingAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for agent tag ");
		}
		return SKIP_BODY;
	}
}

