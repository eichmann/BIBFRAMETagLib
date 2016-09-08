package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioContinuedUnderNewTitleByIterator theAudioContinuedUnderNewTitleByIterator = (AudioContinuedUnderNewTitleByIterator)findAncestorWithClass(this, AudioContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theAudioContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

