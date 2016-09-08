package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIsPartOfIterator theThreeDimensionalObjectIsPartOfIterator = (ThreeDimensionalObjectIsPartOfIterator)findAncestorWithClass(this, ThreeDimensionalObjectIsPartOfIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

