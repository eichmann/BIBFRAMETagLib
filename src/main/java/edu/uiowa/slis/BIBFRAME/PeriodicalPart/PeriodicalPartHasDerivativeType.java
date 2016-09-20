package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasDerivativeIterator thePeriodicalPartHasDerivativeIterator = (PeriodicalPartHasDerivativeIterator)findAncestorWithClass(this, PeriodicalPartHasDerivativeIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

