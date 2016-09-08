package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSeparatedFromIterator theThreeDimensionalObjectSeparatedFromIterator = (ThreeDimensionalObjectSeparatedFromIterator)findAncestorWithClass(this, ThreeDimensionalObjectSeparatedFromIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

