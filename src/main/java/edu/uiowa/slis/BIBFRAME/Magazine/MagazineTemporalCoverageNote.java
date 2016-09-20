package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineTemporalCoverageNoteIterator theMagazine = (MagazineTemporalCoverageNoteIterator)findAncestorWithClass(this, MagazineTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theMagazine.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

