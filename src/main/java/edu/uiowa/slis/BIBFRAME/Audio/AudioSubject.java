package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSubjectIterator theAudioSubjectIterator = (AudioSubjectIterator)findAncestorWithClass(this, AudioSubjectIterator.class);
			pageContext.getOut().print(theAudioSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for subject tag ");
		}
		return SKIP_BODY;
	}
}

