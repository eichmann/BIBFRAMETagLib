package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasSupplementIterator theThreeDimensionalObjectHasSupplementIterator = (ThreeDimensionalObjectHasSupplementIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasSupplementIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

