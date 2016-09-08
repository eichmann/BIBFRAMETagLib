package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageFollowsInNarrativeIterator theMovingImageFollowsInNarrativeIterator = (MovingImageFollowsInNarrativeIterator)findAncestorWithClass(this, MovingImageFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theMovingImageFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

