package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectFollowsIterator theThreeDimensionalObjectFollowsIterator = (ThreeDimensionalObjectFollowsIterator)findAncestorWithClass(this, ThreeDimensionalObjectFollowsIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for follows tag ");
		}
		return SKIP_BODY;
	}
}

