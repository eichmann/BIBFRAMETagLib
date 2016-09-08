package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicFollowsInNarrativeIterator theNotatedMusicFollowsInNarrativeIterator = (NotatedMusicFollowsInNarrativeIterator)findAncestorWithClass(this, NotatedMusicFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theNotatedMusicFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

