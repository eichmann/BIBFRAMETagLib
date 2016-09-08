package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioFrequencyIterator theAudio = (AudioFrequencyIterator)findAncestorWithClass(this, AudioFrequencyIterator.class);
			pageContext.getOut().print(theAudio.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for frequency tag ");
		}
		return SKIP_BODY;
	}
}

