package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRecordedIn extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceRecordedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRecordedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRecordedInIterator theConferenceRecordedInIterator = (ConferenceRecordedInIterator)findAncestorWithClass(this, ConferenceRecordedInIterator.class);
			pageContext.getOut().print(theConferenceRecordedInIterator.getRecordedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for recordedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for recordedIn tag ");
		}
		return SKIP_BODY;
	}
}

