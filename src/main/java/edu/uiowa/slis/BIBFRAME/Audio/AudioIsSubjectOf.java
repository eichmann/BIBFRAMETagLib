package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIsSubjectOfIterator theAudioIsSubjectOfIterator = (AudioIsSubjectOfIterator)findAncestorWithClass(this, AudioIsSubjectOfIterator.class);
			pageContext.getOut().print(theAudioIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

