package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaFollowsInNarrativeInverseIterator theMultimediaFollowsInNarrativeInverseIterator = (MultimediaFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MultimediaFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMultimediaFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

