package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectFollowsInNarrativeIterator theThreeDimensionalObjectFollowsInNarrativeIterator = (ThreeDimensionalObjectFollowsInNarrativeIterator)findAncestorWithClass(this, ThreeDimensionalObjectFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

