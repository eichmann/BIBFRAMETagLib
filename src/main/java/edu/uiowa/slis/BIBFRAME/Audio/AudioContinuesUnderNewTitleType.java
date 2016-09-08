package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioContinuesUnderNewTitleIterator theAudioContinuesUnderNewTitleIterator = (AudioContinuesUnderNewTitleIterator)findAncestorWithClass(this, AudioContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theAudioContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

