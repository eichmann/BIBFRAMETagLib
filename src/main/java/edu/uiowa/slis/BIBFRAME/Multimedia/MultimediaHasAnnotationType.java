package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasAnnotationIterator theMultimediaHasAnnotationIterator = (MultimediaHasAnnotationIterator)findAncestorWithClass(this, MultimediaHasAnnotationIterator.class);
			pageContext.getOut().print(theMultimediaHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

