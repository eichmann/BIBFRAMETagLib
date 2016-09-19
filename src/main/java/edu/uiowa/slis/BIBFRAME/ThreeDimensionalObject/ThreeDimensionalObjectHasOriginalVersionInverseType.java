package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasOriginalVersionInverseIterator theThreeDimensionalObjectHasOriginalVersionInverseIterator = (ThreeDimensionalObjectHasOriginalVersionInverseIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

