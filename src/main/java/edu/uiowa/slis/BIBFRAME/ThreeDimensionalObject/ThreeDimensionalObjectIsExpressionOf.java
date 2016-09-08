package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsExpressionOfIterator theThreeDimensionalObjectIsExpressionOfIterator = (ThreeDimensionalObjectIsExpressionOfIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsExpressionOfIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

