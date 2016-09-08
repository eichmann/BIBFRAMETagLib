package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectPrecedesInNarrativeIterator theThreeDimensionalObjectPrecedesInNarrativeIterator = (ThreeDimensionalObjectPrecedesInNarrativeIterator)findAncestorWithClass(this, ThreeDimensionalObjectPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

