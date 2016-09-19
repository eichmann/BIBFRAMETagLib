package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasAnnotationIterator theMultipartMonographHasAnnotationIterator = (MultipartMonographHasAnnotationIterator)findAncestorWithClass(this, MultipartMonographHasAnnotationIterator.class);
			pageContext.getOut().print(theMultipartMonographHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

