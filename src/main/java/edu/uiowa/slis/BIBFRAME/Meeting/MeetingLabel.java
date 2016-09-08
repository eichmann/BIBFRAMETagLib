package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Meeting theMeeting = (Meeting)findAncestorWithClass(this, Meeting.class);
			if (!theMeeting.commitNeeded) {
				pageContext.getOut().print(theMeeting.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Meeting theMeeting = (Meeting)findAncestorWithClass(this, Meeting.class);
			return theMeeting.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Meeting for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Meeting theMeeting = (Meeting)findAncestorWithClass(this, Meeting.class);
			theMeeting.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for label tag ");
		}
	}
}

