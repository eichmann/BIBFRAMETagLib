package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicFollowsInNarrativeInverseIterator theNotatedMusicFollowsInNarrativeInverseIterator = (NotatedMusicFollowsInNarrativeInverseIterator)findAncestorWithClass(this, NotatedMusicFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

