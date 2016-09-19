package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementPrecedesInNarrativeInverseIterator theNotatedMovementPrecedesInNarrativeInverseIterator = (NotatedMovementPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, NotatedMovementPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

