package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasExpressionIterator thePeriodicalPartHasExpressionIterator = (PeriodicalPartHasExpressionIterator)findAncestorWithClass(this, PeriodicalPartHasExpressionIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

