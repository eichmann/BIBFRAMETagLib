package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectTranslatesIterator theThreeDimensionalObjectTranslatesIterator = (ThreeDimensionalObjectTranslatesIterator)findAncestorWithClass(this, ThreeDimensionalObjectTranslatesIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for translates tag ");
		}
		return SKIP_BODY;
	}
}

