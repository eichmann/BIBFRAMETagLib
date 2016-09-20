package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartAbsorbedByIterator thePeriodicalPartAbsorbedByIterator = (PeriodicalPartAbsorbedByIterator)findAncestorWithClass(this, PeriodicalPartAbsorbedByIterator.class);
			pageContext.getOut().print(thePeriodicalPartAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

