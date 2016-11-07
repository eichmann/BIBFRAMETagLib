package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementPrecedesIterator theNotatedMovementPrecedesIterator = (NotatedMovementPrecedesIterator)findAncestorWithClass(this, NotatedMovementPrecedesIterator.class);
			pageContext.getOut().print(theNotatedMovementPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for precedes tag ");
		}
		return SKIP_BODY;
	}
}
