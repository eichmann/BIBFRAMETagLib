package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasDataSourceIterator theAudioHasDataSourceIterator = (AudioHasDataSourceIterator)findAncestorWithClass(this, AudioHasDataSourceIterator.class);
			pageContext.getOut().print(theAudioHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

