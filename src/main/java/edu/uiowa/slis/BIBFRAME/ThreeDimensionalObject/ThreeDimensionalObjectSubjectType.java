package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSubjectIterator theThreeDimensionalObjectSubjectIterator = (ThreeDimensionalObjectSubjectIterator)findAncestorWithClass(this, ThreeDimensionalObjectSubjectIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for subject tag ");
		}
		return SKIP_BODY;
	}
}

