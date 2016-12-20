package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasAnnotationIterator theLocationHasAnnotationIterator = (LocationHasAnnotationIterator)findAncestorWithClass(this, LocationHasAnnotationIterator.class);
			pageContext.getOut().print(theLocationHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

