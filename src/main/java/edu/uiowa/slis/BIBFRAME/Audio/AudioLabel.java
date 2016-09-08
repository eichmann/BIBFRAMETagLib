package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Audio theAudio = (Audio)findAncestorWithClass(this, Audio.class);
			if (!theAudio.commitNeeded) {
				pageContext.getOut().print(theAudio.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Audio theAudio = (Audio)findAncestorWithClass(this, Audio.class);
			return theAudio.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Audio for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Audio theAudio = (Audio)findAncestorWithClass(this, Audio.class);
			theAudio.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for label tag ");
		}
	}
}

