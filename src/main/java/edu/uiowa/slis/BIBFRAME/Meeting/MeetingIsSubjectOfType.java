package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingIsSubjectOfIterator theMeetingIsSubjectOfIterator = (MeetingIsSubjectOfIterator)findAncestorWithClass(this, MeetingIsSubjectOfIterator.class);
			pageContext.getOut().print(theMeetingIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

