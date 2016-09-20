package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartPrecedesIterator thePeriodicalPartPrecedesIterator = (PeriodicalPartPrecedesIterator)findAncestorWithClass(this, PeriodicalPartPrecedesIterator.class);
			pageContext.getOut().print(thePeriodicalPartPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for precedes tag ");
		}
		return SKIP_BODY;
	}
}

