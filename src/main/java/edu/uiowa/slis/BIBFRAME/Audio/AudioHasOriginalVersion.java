package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasOriginalVersionIterator theAudioHasOriginalVersionIterator = (AudioHasOriginalVersionIterator)findAncestorWithClass(this, AudioHasOriginalVersionIterator.class);
			pageContext.getOut().print(theAudioHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

