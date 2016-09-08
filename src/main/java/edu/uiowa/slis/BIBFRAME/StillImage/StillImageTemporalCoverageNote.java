package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StillImageTemporalCoverageNoteIterator theStillImage = (StillImageTemporalCoverageNoteIterator)findAncestorWithClass(this, StillImageTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theStillImage.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

