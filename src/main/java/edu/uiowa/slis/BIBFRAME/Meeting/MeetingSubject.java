package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingSubjectIterator theMeetingSubjectIterator = (MeetingSubjectIterator)findAncestorWithClass(this, MeetingSubjectIterator.class);
			pageContext.getOut().print(theMeetingSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for subject tag ");
		}
		return SKIP_BODY;
	}
}

