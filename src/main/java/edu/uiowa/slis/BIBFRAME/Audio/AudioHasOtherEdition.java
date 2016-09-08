package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasOtherEditionIterator theAudioHasOtherEditionIterator = (AudioHasOtherEditionIterator)findAncestorWithClass(this, AudioHasOtherEditionIterator.class);
			pageContext.getOut().print(theAudioHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

