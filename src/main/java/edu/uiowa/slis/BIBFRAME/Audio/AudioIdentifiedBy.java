package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIdentifiedByIterator theAudioIdentifiedByIterator = (AudioIdentifiedByIterator)findAncestorWithClass(this, AudioIdentifiedByIterator.class);
			pageContext.getOut().print(theAudioIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

