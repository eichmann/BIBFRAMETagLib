package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsFindingAidForIterator theThreeDimensionalObjectIsFindingAidForIterator = (ThreeDimensionalObjectIsFindingAidForIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsFindingAidForIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

