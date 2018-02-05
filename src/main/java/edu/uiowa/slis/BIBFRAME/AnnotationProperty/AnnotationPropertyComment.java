package edu.uiowa.slis.BIBFRAME.AnnotationProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnnotationPropertyComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnnotationPropertyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(AnnotationPropertyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AnnotationPropertyCommentIterator theAnnotationProperty = (AnnotationPropertyCommentIterator)findAncestorWithClass(this, AnnotationPropertyCommentIterator.class);
			pageContext.getOut().print(theAnnotationProperty.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing AnnotationProperty for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing AnnotationProperty for comment tag ");
		}
		return SKIP_BODY;
	}
}

