package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsExpressionOfIterator thePeriodicalIsExpressionOfIterator = (PeriodicalIsExpressionOfIterator)findAncestorWithClass(this, PeriodicalIsExpressionOfIterator.class);
			pageContext.getOut().print(thePeriodicalIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

