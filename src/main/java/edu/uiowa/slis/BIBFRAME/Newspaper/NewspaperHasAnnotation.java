package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasAnnotationIterator theNewspaperHasAnnotationIterator = (NewspaperHasAnnotationIterator)findAncestorWithClass(this, NewspaperHasAnnotationIterator.class);
			pageContext.getOut().print(theNewspaperHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

