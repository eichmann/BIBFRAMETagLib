package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectPerformedAtIterator theThreeDimensionalObjectPerformedAtIterator = (ThreeDimensionalObjectPerformedAtIterator)findAncestorWithClass(this, ThreeDimensionalObjectPerformedAtIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

