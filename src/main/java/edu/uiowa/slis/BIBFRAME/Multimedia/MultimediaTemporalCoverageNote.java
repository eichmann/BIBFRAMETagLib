package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultimediaTemporalCoverageNoteIterator theMultimedia = (MultimediaTemporalCoverageNoteIterator)findAncestorWithClass(this, MultimediaTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theMultimedia.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

