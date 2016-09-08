package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioFollowsInNarrativeIterator theAudioFollowsInNarrativeIterator = (AudioFollowsInNarrativeIterator)findAncestorWithClass(this, AudioFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theAudioFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

