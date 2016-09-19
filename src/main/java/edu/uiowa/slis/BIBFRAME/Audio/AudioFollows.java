package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioFollowsIterator theAudioFollowsIterator = (AudioFollowsIterator)findAncestorWithClass(this, AudioFollowsIterator.class);
			pageContext.getOut().print(theAudioFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for follows tag ");
		}
		return SKIP_BODY;
	}
}

