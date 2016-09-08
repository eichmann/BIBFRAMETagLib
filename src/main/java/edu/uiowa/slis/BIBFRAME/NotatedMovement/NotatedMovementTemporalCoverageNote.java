package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementTemporalCoverageNoteIterator theNotatedMovement = (NotatedMovementTemporalCoverageNoteIterator)findAncestorWithClass(this, NotatedMovementTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theNotatedMovement.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

