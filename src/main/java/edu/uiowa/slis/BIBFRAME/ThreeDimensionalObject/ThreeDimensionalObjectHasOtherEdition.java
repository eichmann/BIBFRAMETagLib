package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasOtherEditionIterator theThreeDimensionalObjectHasOtherEditionIterator = (ThreeDimensionalObjectHasOtherEditionIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasOtherEditionIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

