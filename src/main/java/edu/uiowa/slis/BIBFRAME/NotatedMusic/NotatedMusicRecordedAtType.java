package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicRecordedAtIterator theNotatedMusicRecordedAtIterator = (NotatedMusicRecordedAtIterator)findAncestorWithClass(this, NotatedMusicRecordedAtIterator.class);
			pageContext.getOut().print(theNotatedMusicRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

