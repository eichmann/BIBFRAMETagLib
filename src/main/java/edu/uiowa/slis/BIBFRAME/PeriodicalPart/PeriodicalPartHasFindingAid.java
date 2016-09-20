package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasFindingAidIterator thePeriodicalPartHasFindingAidIterator = (PeriodicalPartHasFindingAidIterator)findAncestorWithClass(this, PeriodicalPartHasFindingAidIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

