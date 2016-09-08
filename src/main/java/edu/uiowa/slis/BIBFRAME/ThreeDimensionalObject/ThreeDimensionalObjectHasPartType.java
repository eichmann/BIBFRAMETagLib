package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasPartIterator theThreeDimensionalObjectHasPartIterator = (ThreeDimensionalObjectHasPartIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasPartIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

