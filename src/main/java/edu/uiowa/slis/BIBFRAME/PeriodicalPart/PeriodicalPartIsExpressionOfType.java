package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIsExpressionOfIterator thePeriodicalPartIsExpressionOfIterator = (PeriodicalPartIsExpressionOfIterator)findAncestorWithClass(this, PeriodicalPartIsExpressionOfIterator.class);
			pageContext.getOut().print(thePeriodicalPartIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}
