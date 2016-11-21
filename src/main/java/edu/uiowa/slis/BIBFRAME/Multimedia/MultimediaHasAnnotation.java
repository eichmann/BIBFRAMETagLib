package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasAnnotationIterator theMultimediaHasAnnotationIterator = (MultimediaHasAnnotationIterator)findAncestorWithClass(this, MultimediaHasAnnotationIterator.class);
			pageContext.getOut().print(theMultimediaHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

