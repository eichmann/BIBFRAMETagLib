package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasTitleIterator theThreeDimensionalObjectHasTitleIterator = (ThreeDimensionalObjectHasTitleIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasTitleIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

