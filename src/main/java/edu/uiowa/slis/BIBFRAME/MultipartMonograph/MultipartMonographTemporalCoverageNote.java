package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographTemporalCoverageNoteIterator theMultipartMonograph = (MultipartMonographTemporalCoverageNoteIterator)findAncestorWithClass(this, MultipartMonographTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theMultipartMonograph.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

