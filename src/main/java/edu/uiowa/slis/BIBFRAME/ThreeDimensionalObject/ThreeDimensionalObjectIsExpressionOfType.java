package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsExpressionOfIterator theThreeDimensionalObjectIsExpressionOfIterator = (ThreeDimensionalObjectIsExpressionOfIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsExpressionOfIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

