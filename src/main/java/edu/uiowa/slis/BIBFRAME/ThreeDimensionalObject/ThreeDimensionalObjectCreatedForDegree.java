package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectCreatedForDegreeIterator theThreeDimensionalObjectCreatedForDegreeIterator = (ThreeDimensionalObjectCreatedForDegreeIterator)findAncestorWithClass(this, ThreeDimensionalObjectCreatedForDegreeIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}
