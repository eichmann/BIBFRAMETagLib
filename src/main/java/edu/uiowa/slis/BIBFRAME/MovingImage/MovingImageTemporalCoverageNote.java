package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MovingImageTemporalCoverageNoteIterator theMovingImage = (MovingImageTemporalCoverageNoteIterator)findAncestorWithClass(this, MovingImageTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theMovingImage.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

