package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicGeographicCoverageNoteIterator theNotatedMusic = (NotatedMusicGeographicCoverageNoteIterator)findAncestorWithClass(this, NotatedMusicGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theNotatedMusic.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

