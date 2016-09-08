package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioTemporalCoverageNoteIterator theAudio = (AudioTemporalCoverageNoteIterator)findAncestorWithClass(this, AudioTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theAudio.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

