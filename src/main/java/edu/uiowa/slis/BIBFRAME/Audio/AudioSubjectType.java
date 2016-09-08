package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSubjectIterator theAudioSubjectIterator = (AudioSubjectIterator)findAncestorWithClass(this, AudioSubjectIterator.class);
			pageContext.getOut().print(theAudioSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for subject tag ");
		}
		return SKIP_BODY;
	}
}

