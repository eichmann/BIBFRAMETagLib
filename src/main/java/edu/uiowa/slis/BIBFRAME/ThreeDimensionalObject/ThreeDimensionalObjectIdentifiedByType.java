package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectIdentifiedByIterator theThreeDimensionalObjectIdentifiedByIterator = (ThreeDimensionalObjectIdentifiedByIterator)findAncestorWithClass(this, ThreeDimensionalObjectIdentifiedByIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

