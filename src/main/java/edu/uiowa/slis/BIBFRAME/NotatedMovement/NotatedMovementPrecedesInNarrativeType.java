package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementPrecedesInNarrativeIterator theNotatedMovementPrecedesInNarrativeIterator = (NotatedMovementPrecedesInNarrativeIterator)findAncestorWithClass(this, NotatedMovementPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theNotatedMovementPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

