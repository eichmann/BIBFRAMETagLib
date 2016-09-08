package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSubjectIterator thePeriodicalSubjectIterator = (PeriodicalSubjectIterator)findAncestorWithClass(this, PeriodicalSubjectIterator.class);
			pageContext.getOut().print(thePeriodicalSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for subject tag ");
		}
		return SKIP_BODY;
	}
}

