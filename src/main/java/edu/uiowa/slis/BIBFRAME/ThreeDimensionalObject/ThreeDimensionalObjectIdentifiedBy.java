package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIdentifiedByIterator theThreeDimensionalObjectIdentifiedByIterator = (ThreeDimensionalObjectIdentifiedByIterator)findAncestorWithClass(this, ThreeDimensionalObjectIdentifiedByIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

