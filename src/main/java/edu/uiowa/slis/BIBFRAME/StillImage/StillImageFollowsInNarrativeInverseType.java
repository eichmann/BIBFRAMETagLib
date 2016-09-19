package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageFollowsInNarrativeInverseIterator theStillImageFollowsInNarrativeInverseIterator = (StillImageFollowsInNarrativeInverseIterator)findAncestorWithClass(this, StillImageFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theStillImageFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

