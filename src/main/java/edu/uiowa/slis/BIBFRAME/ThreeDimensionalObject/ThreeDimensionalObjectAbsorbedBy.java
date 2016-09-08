package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectAbsorbedByIterator theThreeDimensionalObjectAbsorbedByIterator = (ThreeDimensionalObjectAbsorbedByIterator)findAncestorWithClass(this, ThreeDimensionalObjectAbsorbedByIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

