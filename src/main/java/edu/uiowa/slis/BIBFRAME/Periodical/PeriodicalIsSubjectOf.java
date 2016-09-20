package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsSubjectOfIterator thePeriodicalIsSubjectOfIterator = (PeriodicalIsSubjectOfIterator)findAncestorWithClass(this, PeriodicalIsSubjectOfIterator.class);
			pageContext.getOut().print(thePeriodicalIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

