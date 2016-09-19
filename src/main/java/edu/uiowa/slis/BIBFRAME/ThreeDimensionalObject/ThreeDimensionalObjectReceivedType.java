package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectReceivedIterator theThreeDimensionalObjectReceivedIterator = (ThreeDimensionalObjectReceivedIterator)findAncestorWithClass(this, ThreeDimensionalObjectReceivedIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for received tag ");
		}
		return SKIP_BODY;
	}
}

