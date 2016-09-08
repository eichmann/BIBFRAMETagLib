package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioGeographicCoverageNoteIterator theAudio = (AudioGeographicCoverageNoteIterator)findAncestorWithClass(this, AudioGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theAudio.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

