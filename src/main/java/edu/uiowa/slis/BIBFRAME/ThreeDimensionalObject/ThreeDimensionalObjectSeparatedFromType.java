package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSeparatedFromIterator theThreeDimensionalObjectSeparatedFromIterator = (ThreeDimensionalObjectSeparatedFromIterator)findAncestorWithClass(this, ThreeDimensionalObjectSeparatedFromIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

