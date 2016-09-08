package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasAbsorbedIterator theThreeDimensionalObjectHasAbsorbedIterator = (ThreeDimensionalObjectHasAbsorbedIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasAbsorbedIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

