package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioRelationInverseIterator theAudioRelationInverseIterator = (AudioRelationInverseIterator)findAncestorWithClass(this, AudioRelationInverseIterator.class);
			pageContext.getOut().print(theAudioRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for relation tag ");
		}
		return SKIP_BODY;
	}
}

