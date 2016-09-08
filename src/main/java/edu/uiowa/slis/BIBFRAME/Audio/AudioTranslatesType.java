package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioTranslatesIterator theAudioTranslatesIterator = (AudioTranslatesIterator)findAncestorWithClass(this, AudioTranslatesIterator.class);
			pageContext.getOut().print(theAudioTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for translates tag ");
		}
		return SKIP_BODY;
	}
}

