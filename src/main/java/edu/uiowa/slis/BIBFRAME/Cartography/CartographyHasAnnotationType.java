package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasAnnotationIterator theCartographyHasAnnotationIterator = (CartographyHasAnnotationIterator)findAncestorWithClass(this, CartographyHasAnnotationIterator.class);
			pageContext.getOut().print(theCartographyHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

