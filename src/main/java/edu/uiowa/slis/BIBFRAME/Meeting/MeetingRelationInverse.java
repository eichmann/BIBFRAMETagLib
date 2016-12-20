package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingRelationInverseIterator theMeetingRelationInverseIterator = (MeetingRelationInverseIterator)findAncestorWithClass(this, MeetingRelationInverseIterator.class);
			pageContext.getOut().print(theMeetingRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for relation tag ");
		}
		return SKIP_BODY;
	}
}

