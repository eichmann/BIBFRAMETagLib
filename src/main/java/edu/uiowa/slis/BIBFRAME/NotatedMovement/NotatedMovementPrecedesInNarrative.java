package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementPrecedesInNarrativeIterator theNotatedMovementPrecedesInNarrativeIterator = (NotatedMovementPrecedesInNarrativeIterator)findAncestorWithClass(this, NotatedMovementPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theNotatedMovementPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

