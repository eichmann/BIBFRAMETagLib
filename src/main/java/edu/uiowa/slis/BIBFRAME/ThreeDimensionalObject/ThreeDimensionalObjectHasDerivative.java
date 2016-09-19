package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasDerivativeIterator theThreeDimensionalObjectHasDerivativeIterator = (ThreeDimensionalObjectHasDerivativeIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasDerivativeIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

