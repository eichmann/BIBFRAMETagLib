package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectPrecedesInNarrativeIterator theThreeDimensionalObjectPrecedesInNarrativeIterator = (ThreeDimensionalObjectPrecedesInNarrativeIterator)findAncestorWithClass(this, ThreeDimensionalObjectPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

