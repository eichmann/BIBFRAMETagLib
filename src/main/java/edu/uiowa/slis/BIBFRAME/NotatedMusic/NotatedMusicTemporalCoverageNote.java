package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicTemporalCoverageNoteIterator theNotatedMusic = (NotatedMusicTemporalCoverageNoteIterator)findAncestorWithClass(this, NotatedMusicTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theNotatedMusic.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

