package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasAnnotationIterator theNewspaperHasAnnotationIterator = (NewspaperHasAnnotationIterator)findAncestorWithClass(this, NewspaperHasAnnotationIterator.class);
			pageContext.getOut().print(theNewspaperHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

