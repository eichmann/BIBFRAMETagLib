package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasDataSourceInverseIterator theThreeDimensionalObjectHasDataSourceInverseIterator = (ThreeDimensionalObjectHasDataSourceInverseIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

