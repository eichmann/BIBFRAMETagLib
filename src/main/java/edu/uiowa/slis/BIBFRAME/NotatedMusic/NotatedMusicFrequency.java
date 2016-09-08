package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicFrequencyIterator theNotatedMusic = (NotatedMusicFrequencyIterator)findAncestorWithClass(this, NotatedMusicFrequencyIterator.class);
			pageContext.getOut().print(theNotatedMusic.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for frequency tag ");
		}
		return SKIP_BODY;
	}
}

