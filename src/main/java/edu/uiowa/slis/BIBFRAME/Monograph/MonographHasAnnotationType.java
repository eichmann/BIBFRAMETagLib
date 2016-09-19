package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasAnnotationIterator theMonographHasAnnotationIterator = (MonographHasAnnotationIterator)findAncestorWithClass(this, MonographHasAnnotationIterator.class);
			pageContext.getOut().print(theMonographHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

