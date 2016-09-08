package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectContinuedUnderNewTitleByIterator theThreeDimensionalObjectContinuedUnderNewTitleByIterator = (ThreeDimensionalObjectContinuedUnderNewTitleByIterator)findAncestorWithClass(this, ThreeDimensionalObjectContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

