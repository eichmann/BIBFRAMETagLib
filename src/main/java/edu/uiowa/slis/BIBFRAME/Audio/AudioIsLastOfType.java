package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIsLastOfIterator theAudioIsLastOfIterator = (AudioIsLastOfIterator)findAncestorWithClass(this, AudioIsLastOfIterator.class);
			pageContext.getOut().print(theAudioIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

