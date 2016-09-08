package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Audio theAudio = (Audio)findAncestorWithClass(this, Audio.class);
			if (!theAudio.commitNeeded) {
				pageContext.getOut().print(theAudio.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Audio theAudio = (Audio)findAncestorWithClass(this, Audio.class);
			return theAudio.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Audio for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Audio theAudio = (Audio)findAncestorWithClass(this, Audio.class);
			theAudio.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for subjectURI tag ");
		}
	}
}

