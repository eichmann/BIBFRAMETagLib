package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectRecordedAtIterator theThreeDimensionalObjectRecordedAtIterator = (ThreeDimensionalObjectRecordedAtIterator)findAncestorWithClass(this, ThreeDimensionalObjectRecordedAtIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

