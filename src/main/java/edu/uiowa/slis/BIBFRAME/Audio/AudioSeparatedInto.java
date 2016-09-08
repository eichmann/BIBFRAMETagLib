package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSeparatedIntoIterator theAudioSeparatedIntoIterator = (AudioSeparatedIntoIterator)findAncestorWithClass(this, AudioSeparatedIntoIterator.class);
			pageContext.getOut().print(theAudioSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

