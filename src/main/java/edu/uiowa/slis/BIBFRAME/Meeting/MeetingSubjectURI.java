package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Meeting theMeeting = (Meeting)findAncestorWithClass(this, Meeting.class);
			if (!theMeeting.commitNeeded) {
				pageContext.getOut().print(theMeeting.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Meeting theMeeting = (Meeting)findAncestorWithClass(this, Meeting.class);
			return theMeeting.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Meeting for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Meeting theMeeting = (Meeting)findAncestorWithClass(this, Meeting.class);
			theMeeting.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for subjectURI tag ");
		}
	}
}

