package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasAnnotationIterator theWorkHasAnnotationIterator = (WorkHasAnnotationIterator)findAncestorWithClass(this, WorkHasAnnotationIterator.class);
			pageContext.getOut().print(theWorkHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

