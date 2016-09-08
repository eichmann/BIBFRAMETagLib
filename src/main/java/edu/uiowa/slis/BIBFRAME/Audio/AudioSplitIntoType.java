package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSplitIntoIterator theAudioSplitIntoIterator = (AudioSplitIntoIterator)findAncestorWithClass(this, AudioSplitIntoIterator.class);
			pageContext.getOut().print(theAudioSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

