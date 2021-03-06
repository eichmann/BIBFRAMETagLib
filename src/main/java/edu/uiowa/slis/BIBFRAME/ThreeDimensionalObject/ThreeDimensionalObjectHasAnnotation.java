package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasAnnotationIterator theThreeDimensionalObjectHasAnnotationIterator = (ThreeDimensionalObjectHasAnnotationIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasAnnotationIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

