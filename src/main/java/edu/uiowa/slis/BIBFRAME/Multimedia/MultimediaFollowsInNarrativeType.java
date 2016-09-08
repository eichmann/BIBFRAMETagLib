package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaFollowsInNarrativeIterator theMultimediaFollowsInNarrativeIterator = (MultimediaFollowsInNarrativeIterator)findAncestorWithClass(this, MultimediaFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theMultimediaFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

