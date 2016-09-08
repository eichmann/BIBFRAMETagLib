package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartAbsorbedByIterator thePeriodicalPartAbsorbedByIterator = (PeriodicalPartAbsorbedByIterator)findAncestorWithClass(this, PeriodicalPartAbsorbedByIterator.class);
			pageContext.getOut().print(thePeriodicalPartAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

