package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioProducedAtIterator theAudioProducedAtIterator = (AudioProducedAtIterator)findAncestorWithClass(this, AudioProducedAtIterator.class);
			pageContext.getOut().print(theAudioProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

