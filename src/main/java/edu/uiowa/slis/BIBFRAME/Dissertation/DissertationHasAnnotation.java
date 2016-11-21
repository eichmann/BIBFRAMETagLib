package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasAnnotationIterator theDissertationHasAnnotationIterator = (DissertationHasAnnotationIterator)findAncestorWithClass(this, DissertationHasAnnotationIterator.class);
			pageContext.getOut().print(theDissertationHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

