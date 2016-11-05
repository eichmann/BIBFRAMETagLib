package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioAgentInverseIterator theAudioAgentInverseIterator = (AudioAgentInverseIterator)findAncestorWithClass(this, AudioAgentInverseIterator.class);
			pageContext.getOut().print(theAudioAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for agent tag ");
		}
		return SKIP_BODY;
	}
}

