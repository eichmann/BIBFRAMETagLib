package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioLanguageIterator theAudioLanguageIterator = (AudioLanguageIterator)findAncestorWithClass(this, AudioLanguageIterator.class);
			pageContext.getOut().print(theAudioLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for language tag ");
		}
		return SKIP_BODY;
	}
}

