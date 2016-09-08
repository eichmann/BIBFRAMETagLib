package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageFollowsInNarrativeIterator theStillImageFollowsInNarrativeIterator = (StillImageFollowsInNarrativeIterator)findAncestorWithClass(this, StillImageFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theStillImageFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

