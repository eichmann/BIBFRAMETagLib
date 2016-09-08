package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MovingImageGeographicCoverageNoteIterator theMovingImage = (MovingImageGeographicCoverageNoteIterator)findAncestorWithClass(this, MovingImageGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theMovingImage.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

