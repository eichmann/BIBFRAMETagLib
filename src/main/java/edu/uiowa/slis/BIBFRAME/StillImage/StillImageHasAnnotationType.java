package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasAnnotationIterator theStillImageHasAnnotationIterator = (StillImageHasAnnotationIterator)findAncestorWithClass(this, StillImageHasAnnotationIterator.class);
			pageContext.getOut().print(theStillImageHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

