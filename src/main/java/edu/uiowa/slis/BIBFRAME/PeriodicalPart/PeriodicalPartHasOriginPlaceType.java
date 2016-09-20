package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasOriginPlaceIterator thePeriodicalPartHasOriginPlaceIterator = (PeriodicalPartHasOriginPlaceIterator)findAncestorWithClass(this, PeriodicalPartHasOriginPlaceIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

