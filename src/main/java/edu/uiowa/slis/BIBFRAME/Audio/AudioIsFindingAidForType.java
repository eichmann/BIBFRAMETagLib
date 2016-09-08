package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIsFindingAidForIterator theAudioIsFindingAidForIterator = (AudioIsFindingAidForIterator)findAncestorWithClass(this, AudioIsFindingAidForIterator.class);
			pageContext.getOut().print(theAudioIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

