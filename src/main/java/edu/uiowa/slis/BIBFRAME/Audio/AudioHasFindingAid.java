package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasFindingAidIterator theAudioHasFindingAidIterator = (AudioHasFindingAidIterator)findAncestorWithClass(this, AudioHasFindingAidIterator.class);
			pageContext.getOut().print(theAudioHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

