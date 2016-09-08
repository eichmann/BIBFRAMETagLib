package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsFindingAidForIterator theNotatedMovementIsFindingAidForIterator = (NotatedMovementIsFindingAidForIterator)findAncestorWithClass(this, NotatedMovementIsFindingAidForIterator.class);
			pageContext.getOut().print(theNotatedMovementIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

