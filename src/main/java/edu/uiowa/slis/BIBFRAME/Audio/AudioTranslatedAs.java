package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioTranslatedAsIterator theAudioTranslatedAsIterator = (AudioTranslatedAsIterator)findAncestorWithClass(this, AudioTranslatedAsIterator.class);
			pageContext.getOut().print(theAudioTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

