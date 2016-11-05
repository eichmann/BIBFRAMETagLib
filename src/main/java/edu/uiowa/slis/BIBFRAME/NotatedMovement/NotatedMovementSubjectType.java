package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSubjectIterator theNotatedMovementSubjectIterator = (NotatedMovementSubjectIterator)findAncestorWithClass(this, NotatedMovementSubjectIterator.class);
			pageContext.getOut().print(theNotatedMovementSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for subject tag ");
		}
		return SKIP_BODY;
	}
}

