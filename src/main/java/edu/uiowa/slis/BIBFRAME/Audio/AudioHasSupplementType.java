package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasSupplementIterator theAudioHasSupplementIterator = (AudioHasSupplementIterator)findAncestorWithClass(this, AudioHasSupplementIterator.class);
			pageContext.getOut().print(theAudioHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

