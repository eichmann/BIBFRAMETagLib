package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasAnnotationIterator theMagazineHasAnnotationIterator = (MagazineHasAnnotationIterator)findAncestorWithClass(this, MagazineHasAnnotationIterator.class);
			pageContext.getOut().print(theMagazineHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

