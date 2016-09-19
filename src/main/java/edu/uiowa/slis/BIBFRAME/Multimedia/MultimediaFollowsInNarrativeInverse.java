package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaFollowsInNarrativeInverseIterator theMultimediaFollowsInNarrativeInverseIterator = (MultimediaFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MultimediaFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMultimediaFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

