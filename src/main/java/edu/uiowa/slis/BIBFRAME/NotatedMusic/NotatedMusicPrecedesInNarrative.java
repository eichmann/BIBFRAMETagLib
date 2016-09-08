package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicPrecedesInNarrativeIterator theNotatedMusicPrecedesInNarrativeIterator = (NotatedMusicPrecedesInNarrativeIterator)findAncestorWithClass(this, NotatedMusicPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theNotatedMusicPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

