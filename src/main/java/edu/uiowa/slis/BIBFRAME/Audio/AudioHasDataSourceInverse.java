package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasDataSourceInverseIterator theAudioHasDataSourceInverseIterator = (AudioHasDataSourceInverseIterator)findAncestorWithClass(this, AudioHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theAudioHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

