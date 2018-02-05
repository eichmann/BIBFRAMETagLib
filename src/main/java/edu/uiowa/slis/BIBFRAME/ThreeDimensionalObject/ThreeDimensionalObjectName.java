package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectName currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectNameIterator theThreeDimensionalObject = (ThreeDimensionalObjectNameIterator)findAncestorWithClass(this, ThreeDimensionalObjectNameIterator.class);
			pageContext.getOut().print(theThreeDimensionalObject.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for name tag ");
		}
		return SKIP_BODY;
	}
}

