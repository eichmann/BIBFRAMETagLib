package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementFollowsInNarrativeIterator theNotatedMovementFollowsInNarrativeIterator = (NotatedMovementFollowsInNarrativeIterator)findAncestorWithClass(this, NotatedMovementFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theNotatedMovementFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

