package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasInstanceIterator theThreeDimensionalObjectHasInstanceIterator = (ThreeDimensionalObjectHasInstanceIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasInstanceIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

