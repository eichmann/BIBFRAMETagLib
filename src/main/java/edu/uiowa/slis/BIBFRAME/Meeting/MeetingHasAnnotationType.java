package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingHasAnnotationIterator theMeetingHasAnnotationIterator = (MeetingHasAnnotationIterator)findAncestorWithClass(this, MeetingHasAnnotationIterator.class);
			pageContext.getOut().print(theMeetingHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

