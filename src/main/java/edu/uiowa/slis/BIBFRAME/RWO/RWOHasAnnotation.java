package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOHasAnnotationIterator theRWOHasAnnotationIterator = (RWOHasAnnotationIterator)findAncestorWithClass(this, RWOHasAnnotationIterator.class);
			pageContext.getOut().print(theRWOHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

