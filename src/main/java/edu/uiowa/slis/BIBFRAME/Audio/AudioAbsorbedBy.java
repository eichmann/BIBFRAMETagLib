package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioAbsorbedByIterator theAudioAbsorbedByIterator = (AudioAbsorbedByIterator)findAncestorWithClass(this, AudioAbsorbedByIterator.class);
			pageContext.getOut().print(theAudioAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

