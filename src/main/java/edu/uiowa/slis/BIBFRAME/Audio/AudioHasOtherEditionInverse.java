package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasOtherEditionInverseIterator theAudioHasOtherEditionInverseIterator = (AudioHasOtherEditionInverseIterator)findAncestorWithClass(this, AudioHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theAudioHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

