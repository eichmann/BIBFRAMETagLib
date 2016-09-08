package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalContinuesUnderNewTitleIterator thePeriodicalContinuesUnderNewTitleIterator = (PeriodicalContinuesUnderNewTitleIterator)findAncestorWithClass(this, PeriodicalContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(thePeriodicalContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

