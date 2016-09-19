package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasOtherEditionInverseIterator theThreeDimensionalObjectHasOtherEditionInverseIterator = (ThreeDimensionalObjectHasOtherEditionInverseIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

