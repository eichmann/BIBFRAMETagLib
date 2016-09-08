package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasPartIterator theAudioHasPartIterator = (AudioHasPartIterator)findAncestorWithClass(this, AudioHasPartIterator.class);
			pageContext.getOut().print(theAudioHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

