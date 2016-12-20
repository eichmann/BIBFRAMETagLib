package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingRelationInverseIterator theMeetingRelationInverseIterator = (MeetingRelationInverseIterator)findAncestorWithClass(this, MeetingRelationInverseIterator.class);
			pageContext.getOut().print(theMeetingRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for relation tag ");
		}
		return SKIP_BODY;
	}
}

