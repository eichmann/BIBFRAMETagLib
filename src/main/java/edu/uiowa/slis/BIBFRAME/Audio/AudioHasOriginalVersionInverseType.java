package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasOriginalVersionInverseIterator theAudioHasOriginalVersionInverseIterator = (AudioHasOriginalVersionInverseIterator)findAncestorWithClass(this, AudioHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theAudioHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

