package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementContinuesUnderNewTitleIterator theNotatedMovementContinuesUnderNewTitleIterator = (NotatedMovementContinuesUnderNewTitleIterator)findAncestorWithClass(this, NotatedMovementContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theNotatedMovementContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

