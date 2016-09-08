package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsFirstOfIterator theThreeDimensionalObjectIsFirstOfIterator = (ThreeDimensionalObjectIsFirstOfIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsFirstOfIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

