package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasExpressionIterator thePeriodicalPartHasExpressionIterator = (PeriodicalPartHasExpressionIterator)findAncestorWithClass(this, PeriodicalPartHasExpressionIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}
