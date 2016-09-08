package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioRecordedAtIterator theAudioRecordedAtIterator = (AudioRecordedAtIterator)findAncestorWithClass(this, AudioRecordedAtIterator.class);
			pageContext.getOut().print(theAudioRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

