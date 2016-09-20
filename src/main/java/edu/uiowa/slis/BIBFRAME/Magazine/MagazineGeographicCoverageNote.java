package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineGeographicCoverageNoteIterator theMagazine = (MagazineGeographicCoverageNoteIterator)findAncestorWithClass(this, MagazineGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theMagazine.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

