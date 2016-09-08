package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSupersededByIterator theThreeDimensionalObjectSupersededByIterator = (ThreeDimensionalObjectSupersededByIterator)findAncestorWithClass(this, ThreeDimensionalObjectSupersededByIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

