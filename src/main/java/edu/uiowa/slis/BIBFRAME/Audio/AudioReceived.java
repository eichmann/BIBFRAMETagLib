package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioReceivedIterator theAudioReceivedIterator = (AudioReceivedIterator)findAncestorWithClass(this, AudioReceivedIterator.class);
			pageContext.getOut().print(theAudioReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for received tag ");
		}
		return SKIP_BODY;
	}
}

