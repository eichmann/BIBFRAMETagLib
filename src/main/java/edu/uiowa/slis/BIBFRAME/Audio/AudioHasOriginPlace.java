package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasOriginPlaceIterator theAudioHasOriginPlaceIterator = (AudioHasOriginPlaceIterator)findAncestorWithClass(this, AudioHasOriginPlaceIterator.class);
			pageContext.getOut().print(theAudioHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

