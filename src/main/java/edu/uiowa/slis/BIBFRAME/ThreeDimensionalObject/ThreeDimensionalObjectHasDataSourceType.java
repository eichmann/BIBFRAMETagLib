package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasDataSourceIterator theThreeDimensionalObjectHasDataSourceIterator = (ThreeDimensionalObjectHasDataSourceIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasDataSourceIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}
