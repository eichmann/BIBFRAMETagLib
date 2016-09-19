package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasPreferredTitleIterator theAudioHasPreferredTitleIterator = (AudioHasPreferredTitleIterator)findAncestorWithClass(this, AudioHasPreferredTitleIterator.class);
			pageContext.getOut().print(theAudioHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

