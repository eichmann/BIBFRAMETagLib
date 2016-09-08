package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasInstanceIterator theThreeDimensionalObjectHasInstanceIterator = (ThreeDimensionalObjectHasInstanceIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasInstanceIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

