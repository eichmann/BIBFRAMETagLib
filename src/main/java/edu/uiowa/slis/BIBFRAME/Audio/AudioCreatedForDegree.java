package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioCreatedForDegreeIterator theAudioCreatedForDegreeIterator = (AudioCreatedForDegreeIterator)findAncestorWithClass(this, AudioCreatedForDegreeIterator.class);
			pageContext.getOut().print(theAudioCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

