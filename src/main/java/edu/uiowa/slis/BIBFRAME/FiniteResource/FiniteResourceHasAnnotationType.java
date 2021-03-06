package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasAnnotationIterator theFiniteResourceHasAnnotationIterator = (FiniteResourceHasAnnotationIterator)findAncestorWithClass(this, FiniteResourceHasAnnotationIterator.class);
			pageContext.getOut().print(theFiniteResourceHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

