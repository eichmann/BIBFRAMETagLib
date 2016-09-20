package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasDerivativeIterator thePeriodicalPartHasDerivativeIterator = (PeriodicalPartHasDerivativeIterator)findAncestorWithClass(this, PeriodicalPartHasDerivativeIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

