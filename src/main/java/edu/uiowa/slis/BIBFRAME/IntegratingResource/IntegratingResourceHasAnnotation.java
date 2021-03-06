package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasAnnotationIterator theIntegratingResourceHasAnnotationIterator = (IntegratingResourceHasAnnotationIterator)findAncestorWithClass(this, IntegratingResourceHasAnnotationIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

