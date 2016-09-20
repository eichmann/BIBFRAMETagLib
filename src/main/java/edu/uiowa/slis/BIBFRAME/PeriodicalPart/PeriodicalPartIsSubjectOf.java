package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIsSubjectOfIterator thePeriodicalPartIsSubjectOfIterator = (PeriodicalPartIsSubjectOfIterator)findAncestorWithClass(this, PeriodicalPartIsSubjectOfIterator.class);
			pageContext.getOut().print(thePeriodicalPartIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

