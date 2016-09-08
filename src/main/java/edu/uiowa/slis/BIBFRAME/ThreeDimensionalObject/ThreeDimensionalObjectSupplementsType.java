package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSupplementsIterator theThreeDimensionalObjectSupplementsIterator = (ThreeDimensionalObjectSupplementsIterator)findAncestorWithClass(this, ThreeDimensionalObjectSupplementsIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for supplements tag ");
		}
		return SKIP_BODY;
	}
}

