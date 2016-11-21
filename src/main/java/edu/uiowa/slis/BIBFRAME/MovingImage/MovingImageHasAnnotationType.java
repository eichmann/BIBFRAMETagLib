package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasAnnotationIterator theMovingImageHasAnnotationIterator = (MovingImageHasAnnotationIterator)findAncestorWithClass(this, MovingImageHasAnnotationIterator.class);
			pageContext.getOut().print(theMovingImageHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

