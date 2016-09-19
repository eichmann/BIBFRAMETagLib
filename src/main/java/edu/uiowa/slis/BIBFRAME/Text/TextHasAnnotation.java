package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasAnnotationIterator theTextHasAnnotationIterator = (TextHasAnnotationIterator)findAncestorWithClass(this, TextHasAnnotationIterator.class);
			pageContext.getOut().print(theTextHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

