package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsUnionOfIterator theThreeDimensionalObjectIsUnionOfIterator = (ThreeDimensionalObjectIsUnionOfIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsUnionOfIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

