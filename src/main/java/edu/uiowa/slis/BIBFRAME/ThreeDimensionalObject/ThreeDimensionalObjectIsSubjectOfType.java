package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsSubjectOfIterator theThreeDimensionalObjectIsSubjectOfIterator = (ThreeDimensionalObjectIsSubjectOfIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsSubjectOfIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

