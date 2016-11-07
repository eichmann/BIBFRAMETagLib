package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementFollowsInNarrativeInverseIterator theNotatedMovementFollowsInNarrativeInverseIterator = (NotatedMovementFollowsInNarrativeInverseIterator)findAncestorWithClass(this, NotatedMovementFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}
