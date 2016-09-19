package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectAccompaniesIterator theThreeDimensionalObjectAccompaniesIterator = (ThreeDimensionalObjectAccompaniesIterator)findAncestorWithClass(this, ThreeDimensionalObjectAccompaniesIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

