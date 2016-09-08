package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectAbsorbedByIterator theThreeDimensionalObjectAbsorbedByIterator = (ThreeDimensionalObjectAbsorbedByIterator)findAncestorWithClass(this, ThreeDimensionalObjectAbsorbedByIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

