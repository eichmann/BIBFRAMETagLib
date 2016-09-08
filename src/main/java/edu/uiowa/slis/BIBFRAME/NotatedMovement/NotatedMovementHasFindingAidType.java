package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasFindingAidIterator theNotatedMovementHasFindingAidIterator = (NotatedMovementHasFindingAidIterator)findAncestorWithClass(this, NotatedMovementHasFindingAidIterator.class);
			pageContext.getOut().print(theNotatedMovementHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

