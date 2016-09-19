package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasDerivativeIterator theAudioHasDerivativeIterator = (AudioHasDerivativeIterator)findAncestorWithClass(this, AudioHasDerivativeIterator.class);
			pageContext.getOut().print(theAudioHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

