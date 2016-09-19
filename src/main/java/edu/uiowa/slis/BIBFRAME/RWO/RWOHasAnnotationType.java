package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOHasAnnotationIterator theRWOHasAnnotationIterator = (RWOHasAnnotationIterator)findAncestorWithClass(this, RWOHasAnnotationIterator.class);
			pageContext.getOut().print(theRWOHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

