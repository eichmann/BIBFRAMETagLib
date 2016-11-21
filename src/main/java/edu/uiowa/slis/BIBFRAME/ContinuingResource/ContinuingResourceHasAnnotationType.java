package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasAnnotationIterator theContinuingResourceHasAnnotationIterator = (ContinuingResourceHasAnnotationIterator)findAncestorWithClass(this, ContinuingResourceHasAnnotationIterator.class);
			pageContext.getOut().print(theContinuingResourceHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

