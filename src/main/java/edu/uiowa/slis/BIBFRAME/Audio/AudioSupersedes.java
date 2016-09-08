package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSupersedesIterator theAudioSupersedesIterator = (AudioSupersedesIterator)findAncestorWithClass(this, AudioSupersedesIterator.class);
			pageContext.getOut().print(theAudioSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

