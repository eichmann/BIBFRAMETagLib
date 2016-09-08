package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioContinuesUnderNewTitleIterator theAudioContinuesUnderNewTitleIterator = (AudioContinuesUnderNewTitleIterator)findAncestorWithClass(this, AudioContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theAudioContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

