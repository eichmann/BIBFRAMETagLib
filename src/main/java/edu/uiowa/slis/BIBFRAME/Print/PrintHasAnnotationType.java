package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasAnnotationIterator thePrintHasAnnotationIterator = (PrintHasAnnotationIterator)findAncestorWithClass(this, PrintHasAnnotationIterator.class);
			pageContext.getOut().print(thePrintHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

