package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasInstanceIterator theAudioHasInstanceIterator = (AudioHasInstanceIterator)findAncestorWithClass(this, AudioHasInstanceIterator.class);
			pageContext.getOut().print(theAudioHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

