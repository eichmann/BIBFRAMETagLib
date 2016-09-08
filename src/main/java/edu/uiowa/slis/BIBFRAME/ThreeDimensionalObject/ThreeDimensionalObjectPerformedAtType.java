package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectPerformedAtIterator theThreeDimensionalObjectPerformedAtIterator = (ThreeDimensionalObjectPerformedAtIterator)findAncestorWithClass(this, ThreeDimensionalObjectPerformedAtIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

