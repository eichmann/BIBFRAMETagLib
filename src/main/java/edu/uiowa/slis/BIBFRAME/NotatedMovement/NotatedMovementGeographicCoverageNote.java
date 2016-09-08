package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementGeographicCoverageNoteIterator theNotatedMovement = (NotatedMovementGeographicCoverageNoteIterator)findAncestorWithClass(this, NotatedMovementGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theNotatedMovement.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

