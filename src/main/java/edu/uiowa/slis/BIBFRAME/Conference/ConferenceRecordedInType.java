package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRecordedInType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceRecordedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRecordedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRecordedInIterator theConferenceRecordedInIterator = (ConferenceRecordedInIterator)findAncestorWithClass(this, ConferenceRecordedInIterator.class);
			pageContext.getOut().print(theConferenceRecordedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for recordedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for recordedIn tag ");
		}
		return SKIP_BODY;
	}
}

