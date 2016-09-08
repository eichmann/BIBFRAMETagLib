package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasOtherEditionIterator theThreeDimensionalObjectHasOtherEditionIterator = (ThreeDimensionalObjectHasOtherEditionIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasOtherEditionIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

