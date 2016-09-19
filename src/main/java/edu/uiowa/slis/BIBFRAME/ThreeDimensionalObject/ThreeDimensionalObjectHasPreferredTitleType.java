package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasPreferredTitleIterator theThreeDimensionalObjectHasPreferredTitleIterator = (ThreeDimensionalObjectHasPreferredTitleIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasPreferredTitleIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

