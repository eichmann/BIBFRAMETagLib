package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasDataSourceInverseIterator theAudioHasDataSourceInverseIterator = (AudioHasDataSourceInverseIterator)findAncestorWithClass(this, AudioHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theAudioHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

