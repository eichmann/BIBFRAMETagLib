package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicFollowsIterator theNotatedMusicFollowsIterator = (NotatedMusicFollowsIterator)findAncestorWithClass(this, NotatedMusicFollowsIterator.class);
			pageContext.getOut().print(theNotatedMusicFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for follows tag ");
		}
		return SKIP_BODY;
	}
}

