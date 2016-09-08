package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIsUnionOfIterator theAudioIsUnionOfIterator = (AudioIsUnionOfIterator)findAncestorWithClass(this, AudioIsUnionOfIterator.class);
			pageContext.getOut().print(theAudioIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

