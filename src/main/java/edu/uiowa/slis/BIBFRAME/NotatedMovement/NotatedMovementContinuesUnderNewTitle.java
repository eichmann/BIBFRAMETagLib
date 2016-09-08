package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementContinuesUnderNewTitleIterator theNotatedMovementContinuesUnderNewTitleIterator = (NotatedMovementContinuesUnderNewTitleIterator)findAncestorWithClass(this, NotatedMovementContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theNotatedMovementContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

