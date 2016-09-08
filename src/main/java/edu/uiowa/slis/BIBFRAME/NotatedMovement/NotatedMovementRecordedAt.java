package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementRecordedAtIterator theNotatedMovementRecordedAtIterator = (NotatedMovementRecordedAtIterator)findAncestorWithClass(this, NotatedMovementRecordedAtIterator.class);
			pageContext.getOut().print(theNotatedMovementRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

