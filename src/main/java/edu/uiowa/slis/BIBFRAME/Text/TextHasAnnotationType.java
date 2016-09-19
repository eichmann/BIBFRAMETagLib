package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasAnnotationIterator theTextHasAnnotationIterator = (TextHasAnnotationIterator)findAncestorWithClass(this, TextHasAnnotationIterator.class);
			pageContext.getOut().print(theTextHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

