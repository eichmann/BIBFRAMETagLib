package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasOriginalVersionIterator theThreeDimensionalObjectHasOriginalVersionIterator = (ThreeDimensionalObjectHasOriginalVersionIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasOriginalVersionIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

