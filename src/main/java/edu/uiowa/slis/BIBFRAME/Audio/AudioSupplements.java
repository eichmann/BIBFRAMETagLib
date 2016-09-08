package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioSupplementsIterator theAudioSupplementsIterator = (AudioSupplementsIterator)findAncestorWithClass(this, AudioSupplementsIterator.class);
			pageContext.getOut().print(theAudioSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for supplements tag ");
		}
		return SKIP_BODY;
	}
}

