package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicPerformedAtIterator theNotatedMusicPerformedAtIterator = (NotatedMusicPerformedAtIterator)findAncestorWithClass(this, NotatedMusicPerformedAtIterator.class);
			pageContext.getOut().print(theNotatedMusicPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

