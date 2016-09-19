package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasAnnotationIterator theInstanceHasAnnotationIterator = (InstanceHasAnnotationIterator)findAncestorWithClass(this, InstanceHasAnnotationIterator.class);
			pageContext.getOut().print(theInstanceHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

