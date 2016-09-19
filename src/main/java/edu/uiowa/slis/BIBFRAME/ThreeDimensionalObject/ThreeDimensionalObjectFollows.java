package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectFollowsIterator theThreeDimensionalObjectFollowsIterator = (ThreeDimensionalObjectFollowsIterator)findAncestorWithClass(this, ThreeDimensionalObjectFollowsIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for follows tag ");
		}
		return SKIP_BODY;
	}
}

