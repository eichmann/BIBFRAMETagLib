package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasAbsorbedIterator theAudioHasAbsorbedIterator = (AudioHasAbsorbedIterator)findAncestorWithClass(this, AudioHasAbsorbedIterator.class);
			pageContext.getOut().print(theAudioHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

