package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasAnnotationIterator thePeriodicalPartHasAnnotationIterator = (PeriodicalPartHasAnnotationIterator)findAncestorWithClass(this, PeriodicalPartHasAnnotationIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

