package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectPrecedesInNarrativeInverseIterator theThreeDimensionalObjectPrecedesInNarrativeInverseIterator = (ThreeDimensionalObjectPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, ThreeDimensionalObjectPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

