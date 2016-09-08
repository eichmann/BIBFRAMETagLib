package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultimediaGeographicCoverageNoteIterator theMultimedia = (MultimediaGeographicCoverageNoteIterator)findAncestorWithClass(this, MultimediaGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theMultimedia.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

