package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasOriginPlaceIterator thePeriodicalPartHasOriginPlaceIterator = (PeriodicalPartHasOriginPlaceIterator)findAncestorWithClass(this, PeriodicalPartHasOriginPlaceIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

