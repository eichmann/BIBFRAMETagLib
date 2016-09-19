package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasAnnotationIterator theSerialHasAnnotationIterator = (SerialHasAnnotationIterator)findAncestorWithClass(this, SerialHasAnnotationIterator.class);
			pageContext.getOut().print(theSerialHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

