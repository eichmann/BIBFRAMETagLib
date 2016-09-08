package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StillImageGeographicCoverageNoteIterator theStillImage = (StillImageGeographicCoverageNoteIterator)findAncestorWithClass(this, StillImageGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theStillImage.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

