package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasOriginPlaceIterator theAudioHasOriginPlaceIterator = (AudioHasOriginPlaceIterator)findAncestorWithClass(this, AudioHasOriginPlaceIterator.class);
			pageContext.getOut().print(theAudioHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

