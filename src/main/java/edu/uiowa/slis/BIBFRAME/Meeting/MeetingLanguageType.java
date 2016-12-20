package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingLanguageIterator theMeetingLanguageIterator = (MeetingLanguageIterator)findAncestorWithClass(this, MeetingLanguageIterator.class);
			pageContext.getOut().print(theMeetingLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for language tag ");
		}
		return SKIP_BODY;
	}
}

