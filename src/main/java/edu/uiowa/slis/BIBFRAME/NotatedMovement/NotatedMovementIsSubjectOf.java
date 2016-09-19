package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsSubjectOfIterator theNotatedMovementIsSubjectOfIterator = (NotatedMovementIsSubjectOfIterator)findAncestorWithClass(this, NotatedMovementIsSubjectOfIterator.class);
			pageContext.getOut().print(theNotatedMovementIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

