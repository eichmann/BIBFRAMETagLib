package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSupersededByIterator theAudioSupersededByIterator = (AudioSupersededByIterator)findAncestorWithClass(this, AudioSupersededByIterator.class);
			pageContext.getOut().print(theAudioSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

