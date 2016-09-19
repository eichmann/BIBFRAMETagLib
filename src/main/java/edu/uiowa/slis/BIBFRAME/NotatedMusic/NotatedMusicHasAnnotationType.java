package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasAnnotationIterator theNotatedMusicHasAnnotationIterator = (NotatedMusicHasAnnotationIterator)findAncestorWithClass(this, NotatedMusicHasAnnotationIterator.class);
			pageContext.getOut().print(theNotatedMusicHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

