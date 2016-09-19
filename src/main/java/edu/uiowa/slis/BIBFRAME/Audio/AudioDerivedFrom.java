package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDerivedFromIterator theAudioDerivedFromIterator = (AudioDerivedFromIterator)findAncestorWithClass(this, AudioDerivedFromIterator.class);
			pageContext.getOut().print(theAudioDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

