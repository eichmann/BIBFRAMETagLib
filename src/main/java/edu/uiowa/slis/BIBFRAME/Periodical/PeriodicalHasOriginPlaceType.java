package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasOriginPlaceIterator thePeriodicalHasOriginPlaceIterator = (PeriodicalHasOriginPlaceIterator)findAncestorWithClass(this, PeriodicalHasOriginPlaceIterator.class);
			pageContext.getOut().print(thePeriodicalHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

