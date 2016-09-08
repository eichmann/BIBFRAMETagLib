package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSeparatedFromIterator theAudioSeparatedFromIterator = (AudioSeparatedFromIterator)findAncestorWithClass(this, AudioSeparatedFromIterator.class);
			pageContext.getOut().print(theAudioSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

