package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsLastOfIterator theThreeDimensionalObjectIsLastOfIterator = (ThreeDimensionalObjectIsLastOfIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsLastOfIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

