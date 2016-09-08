package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalContinuesUnderNewTitleIterator thePeriodicalContinuesUnderNewTitleIterator = (PeriodicalContinuesUnderNewTitleIterator)findAncestorWithClass(this, PeriodicalContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(thePeriodicalContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

