package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicFollowsInNarrativeIterator theNotatedMusicFollowsInNarrativeIterator = (NotatedMusicFollowsInNarrativeIterator)findAncestorWithClass(this, NotatedMusicFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theNotatedMusicFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

