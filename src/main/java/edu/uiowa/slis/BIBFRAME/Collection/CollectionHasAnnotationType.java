package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasAnnotationIterator theCollectionHasAnnotationIterator = (CollectionHasAnnotationIterator)findAncestorWithClass(this, CollectionHasAnnotationIterator.class);
			pageContext.getOut().print(theCollectionHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

