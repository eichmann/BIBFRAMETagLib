package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectContinuesUnderNewTitleIterator theThreeDimensionalObjectContinuesUnderNewTitleIterator = (ThreeDimensionalObjectContinuesUnderNewTitleIterator)findAncestorWithClass(this, ThreeDimensionalObjectContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

