package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioLanguageNoteIterator theAudio = (AudioLanguageNoteIterator)findAncestorWithClass(this, AudioLanguageNoteIterator.class);
			pageContext.getOut().print(theAudio.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

