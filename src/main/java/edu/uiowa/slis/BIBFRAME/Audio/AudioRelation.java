package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioRelationIterator theAudioRelationIterator = (AudioRelationIterator)findAncestorWithClass(this, AudioRelationIterator.class);
			pageContext.getOut().print(theAudioRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for relation tag ");
		}
		return SKIP_BODY;
	}
}

