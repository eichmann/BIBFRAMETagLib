package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasOriginPlaceIterator theThreeDimensionalObjectHasOriginPlaceIterator = (ThreeDimensionalObjectHasOriginPlaceIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasOriginPlaceIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

