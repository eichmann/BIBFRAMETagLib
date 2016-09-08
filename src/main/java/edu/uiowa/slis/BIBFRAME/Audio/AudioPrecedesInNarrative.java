package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioPrecedesInNarrativeIterator theAudioPrecedesInNarrativeIterator = (AudioPrecedesInNarrativeIterator)findAncestorWithClass(this, AudioPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theAudioPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

