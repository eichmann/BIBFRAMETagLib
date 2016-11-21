package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasAnnotationIterator theNotatedMovementHasAnnotationIterator = (NotatedMovementHasAnnotationIterator)findAncestorWithClass(this, NotatedMovementHasAnnotationIterator.class);
			pageContext.getOut().print(theNotatedMovementHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

