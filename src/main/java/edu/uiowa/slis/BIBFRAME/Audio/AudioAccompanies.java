package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioAccompaniesIterator theAudioAccompaniesIterator = (AudioAccompaniesIterator)findAncestorWithClass(this, AudioAccompaniesIterator.class);
			pageContext.getOut().print(theAudioAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

