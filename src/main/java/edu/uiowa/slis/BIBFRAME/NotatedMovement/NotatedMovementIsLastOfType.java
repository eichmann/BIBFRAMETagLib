package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsLastOfIterator theNotatedMovementIsLastOfIterator = (NotatedMovementIsLastOfIterator)findAncestorWithClass(this, NotatedMovementIsLastOfIterator.class);
			pageContext.getOut().print(theNotatedMovementIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

