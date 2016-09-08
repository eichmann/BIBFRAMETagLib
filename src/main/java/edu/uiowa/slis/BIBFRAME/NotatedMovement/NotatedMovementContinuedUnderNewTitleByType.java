package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementContinuedUnderNewTitleByIterator theNotatedMovementContinuedUnderNewTitleByIterator = (NotatedMovementContinuedUnderNewTitleByIterator)findAncestorWithClass(this, NotatedMovementContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theNotatedMovementContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

