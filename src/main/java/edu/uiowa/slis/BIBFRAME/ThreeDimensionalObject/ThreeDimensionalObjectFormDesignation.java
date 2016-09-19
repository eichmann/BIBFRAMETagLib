package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectFormDesignationIterator theThreeDimensionalObject = (ThreeDimensionalObjectFormDesignationIterator)findAncestorWithClass(this, ThreeDimensionalObjectFormDesignationIterator.class);
			pageContext.getOut().print(theThreeDimensionalObject.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

