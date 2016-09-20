package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasDerivativeIterator thePeriodicalHasDerivativeIterator = (PeriodicalHasDerivativeIterator)findAncestorWithClass(this, PeriodicalHasDerivativeIterator.class);
			pageContext.getOut().print(thePeriodicalHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

