package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsFirstOfIterator theNotatedMovementIsFirstOfIterator = (NotatedMovementIsFirstOfIterator)findAncestorWithClass(this, NotatedMovementIsFirstOfIterator.class);
			pageContext.getOut().print(theNotatedMovementIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

