package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioPrecedesInNarrativeInverseIterator theAudioPrecedesInNarrativeInverseIterator = (AudioPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, AudioPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theAudioPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

