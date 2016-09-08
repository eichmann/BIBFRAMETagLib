package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasPartIterator theThreeDimensionalObjectHasPartIterator = (ThreeDimensionalObjectHasPartIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasPartIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

