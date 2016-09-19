package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectDerivedFromIterator theThreeDimensionalObjectDerivedFromIterator = (ThreeDimensionalObjectDerivedFromIterator)findAncestorWithClass(this, ThreeDimensionalObjectDerivedFromIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

