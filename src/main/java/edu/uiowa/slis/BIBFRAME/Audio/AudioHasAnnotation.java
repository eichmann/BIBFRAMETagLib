package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasAnnotationIterator theAudioHasAnnotationIterator = (AudioHasAnnotationIterator)findAncestorWithClass(this, AudioHasAnnotationIterator.class);
			pageContext.getOut().print(theAudioHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

