package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIsPartOfIterator theAudioIsPartOfIterator = (AudioIsPartOfIterator)findAncestorWithClass(this, AudioIsPartOfIterator.class);
			pageContext.getOut().print(theAudioIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

