package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectFollowsInNarrativeInverseIterator theThreeDimensionalObjectFollowsInNarrativeInverseIterator = (ThreeDimensionalObjectFollowsInNarrativeInverseIterator)findAncestorWithClass(this, ThreeDimensionalObjectFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

