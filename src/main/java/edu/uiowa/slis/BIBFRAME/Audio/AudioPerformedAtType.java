package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioPerformedAtIterator theAudioPerformedAtIterator = (AudioPerformedAtIterator)findAncestorWithClass(this, AudioPerformedAtIterator.class);
			pageContext.getOut().print(theAudioPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

