package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasTitleIterator theAudioHasTitleIterator = (AudioHasTitleIterator)findAncestorWithClass(this, AudioHasTitleIterator.class);
			pageContext.getOut().print(theAudioHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

