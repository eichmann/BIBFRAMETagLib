package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageFollowsInNarrativeInverseIterator theMovingImageFollowsInNarrativeInverseIterator = (MovingImageFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MovingImageFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMovingImageFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

