package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectPrecedesIterator theThreeDimensionalObjectPrecedesIterator = (ThreeDimensionalObjectPrecedesIterator)findAncestorWithClass(this, ThreeDimensionalObjectPrecedesIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for precedes tag ");
		}
		return SKIP_BODY;
	}
}

