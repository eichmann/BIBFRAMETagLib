package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIsFirstOfIterator theAudioIsFirstOfIterator = (AudioIsFirstOfIterator)findAncestorWithClass(this, AudioIsFirstOfIterator.class);
			pageContext.getOut().print(theAudioIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}
