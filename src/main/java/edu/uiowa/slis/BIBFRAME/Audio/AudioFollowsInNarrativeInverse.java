package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioFollowsInNarrativeInverseIterator theAudioFollowsInNarrativeInverseIterator = (AudioFollowsInNarrativeInverseIterator)findAncestorWithClass(this, AudioFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theAudioFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}
