package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographGeographicCoverageNoteIterator theMultipartMonograph = (MultipartMonographGeographicCoverageNoteIterator)findAncestorWithClass(this, MultipartMonographGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theMultipartMonograph.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

