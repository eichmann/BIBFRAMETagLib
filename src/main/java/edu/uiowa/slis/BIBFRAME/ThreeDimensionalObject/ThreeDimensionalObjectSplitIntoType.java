package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectSplitIntoIterator theThreeDimensionalObjectSplitIntoIterator = (ThreeDimensionalObjectSplitIntoIterator)findAncestorWithClass(this, ThreeDimensionalObjectSplitIntoIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

