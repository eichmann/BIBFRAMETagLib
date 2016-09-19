package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicPrecedesInNarrativeInverseIterator theNotatedMusicPrecedesInNarrativeInverseIterator = (NotatedMusicPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, NotatedMusicPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

