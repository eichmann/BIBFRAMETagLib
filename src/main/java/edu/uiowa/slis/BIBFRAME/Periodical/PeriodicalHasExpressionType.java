package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasExpressionIterator thePeriodicalHasExpressionIterator = (PeriodicalHasExpressionIterator)findAncestorWithClass(this, PeriodicalHasExpressionIterator.class);
			pageContext.getOut().print(thePeriodicalHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}
