package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSeparatedIntoIterator theThreeDimensionalObjectSeparatedIntoIterator = (ThreeDimensionalObjectSeparatedIntoIterator)findAncestorWithClass(this, ThreeDimensionalObjectSeparatedIntoIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

