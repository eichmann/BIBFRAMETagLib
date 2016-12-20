package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingIsPartOfIterator theMeetingIsPartOfIterator = (MeetingIsPartOfIterator)findAncestorWithClass(this, MeetingIsPartOfIterator.class);
			pageContext.getOut().print(theMeetingIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

