package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectFrequencyIterator theThreeDimensionalObject = (ThreeDimensionalObjectFrequencyIterator)findAncestorWithClass(this, ThreeDimensionalObjectFrequencyIterator.class);
			pageContext.getOut().print(theThreeDimensionalObject.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for frequency tag ");
		}
		return SKIP_BODY;
	}
}

