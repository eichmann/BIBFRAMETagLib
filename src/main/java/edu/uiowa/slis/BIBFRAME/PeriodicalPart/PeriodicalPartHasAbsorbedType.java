package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasAbsorbedIterator thePeriodicalPartHasAbsorbedIterator = (PeriodicalPartHasAbsorbedIterator)findAncestorWithClass(this, PeriodicalPartHasAbsorbedIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

