package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioFormDesignationIterator theAudio = (AudioFormDesignationIterator)findAncestorWithClass(this, AudioFormDesignationIterator.class);
			pageContext.getOut().print(theAudio.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

