package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartContinuesUnderNewTitleIterator thePeriodicalPartContinuesUnderNewTitleIterator = (PeriodicalPartContinuesUnderNewTitleIterator)findAncestorWithClass(this, PeriodicalPartContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(thePeriodicalPartContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

