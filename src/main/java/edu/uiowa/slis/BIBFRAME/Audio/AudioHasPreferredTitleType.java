package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasPreferredTitleIterator theAudioHasPreferredTitleIterator = (AudioHasPreferredTitleIterator)findAncestorWithClass(this, AudioHasPreferredTitleIterator.class);
			pageContext.getOut().print(theAudioHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

