package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasAnnotationIterator thePrintHasAnnotationIterator = (PrintHasAnnotationIterator)findAncestorWithClass(this, PrintHasAnnotationIterator.class);
			pageContext.getOut().print(thePrintHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

