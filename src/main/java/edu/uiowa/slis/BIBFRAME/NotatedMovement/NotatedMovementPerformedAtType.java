package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementPerformedAtIterator theNotatedMovementPerformedAtIterator = (NotatedMovementPerformedAtIterator)findAncestorWithClass(this, NotatedMovementPerformedAtIterator.class);
			pageContext.getOut().print(theNotatedMovementPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

