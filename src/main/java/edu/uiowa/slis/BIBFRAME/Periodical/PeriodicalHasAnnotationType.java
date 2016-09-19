package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasAnnotationIterator thePeriodicalHasAnnotationIterator = (PeriodicalHasAnnotationIterator)findAncestorWithClass(this, PeriodicalHasAnnotationIterator.class);
			pageContext.getOut().print(thePeriodicalHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

