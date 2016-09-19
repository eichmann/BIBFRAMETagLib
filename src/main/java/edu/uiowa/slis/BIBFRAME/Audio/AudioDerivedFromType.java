package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDerivedFromIterator theAudioDerivedFromIterator = (AudioDerivedFromIterator)findAncestorWithClass(this, AudioDerivedFromIterator.class);
			pageContext.getOut().print(theAudioDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

