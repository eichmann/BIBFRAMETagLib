package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioPrecedesIterator theAudioPrecedesIterator = (AudioPrecedesIterator)findAncestorWithClass(this, AudioPrecedesIterator.class);
			pageContext.getOut().print(theAudioPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for precedes tag ");
		}
		return SKIP_BODY;
	}
}

