package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasFindingAidIterator theThreeDimensionalObjectHasFindingAidIterator = (ThreeDimensionalObjectHasFindingAidIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasFindingAidIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

